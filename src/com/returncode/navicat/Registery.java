package com.returncode.navicat;

import com.registry.RegistryException;
import com.registry.RegistryKey;

/**
 * 主方法
 *
 * @Author: wanglei
 * @Date: 2020/4/15
 */
public class Registery {

    private RegistryKey getRegistery(String path) {
        RegistryKey registry = new RegistryKey(path);
        return registry;
    }

    private int deleteSubTree(RegistryKey parentKey, String subkeyName) {
        RegistryKey subkey = parentKey.getSubKey(subkeyName);
        if (subkey != null) {
            System.out.println("delete : " + subkey.getPath());
            try {
                return parentKey.deleteSubTree(subkeyName);
            } catch (RegistryException re) {
                re.printStackTrace();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Registery reg = new Registery();
        RegistryKey premiumSoft = reg.getRegistery("\\Software\\PremiumSoft");
        reg.deleteSubTree(premiumSoft, "Data");

        RegistryKey clsId = reg.getRegistery("\\Software\\Classes\\CLSID");
        for (RegistryKey clsIdSubKey : clsId.getSubKeys()) {
            reg.deleteSubTree(clsIdSubKey, "Info");
        }
    }
}
