# navicat-key
延长navicat试用期时间，每次15天。  
使用java写了个小程序，可以自动清理注册表。

## 原理
关闭Navicat  
Win + R，输入regedit回车  
删除HKEY_CURRENT_USER\Software\PremiumSoft\Data  
展开HKEY_CURRENT_USER\Software\Classes\CLSID  
展开每一个子文件夹，如果里面只包含一个名为Info的文件夹，就删掉它。  

## 使用方法
1、下载工程  
2、打开命令提示符  
3、到bin目录下运行命令：`java -jar .\navicat-key.jar`  
4、命令行提示  
```
delete : HKEY_CURRENT_USER\Software\PremiumSoft\Data
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{05FA135A-5E1E-01B9-5855-34A51FA798F7}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{41BDFDC1-F5E0-5BDD-8EEC-29DAD3C82569}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{5559C361-C5CE-8B83-9E44-DBDF22836C08}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{5A264B89-7C4E-A195-6C18-A678B3564CEE}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{87F47564-2369-CA5D-DCB9-E42CDF82B4E2}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{977D7A36-2015-6D90-3146-A9BD98537B11}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{9FF64EAA-208A-FB57-3F87-CE14F191581D}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{D8FE9825-A860-9090-9F05-DDE5111FA86C}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{D91C165F-4E56-713D-B33D-1A82AEC5B263}\Info
delete : HKEY_CURRENT_USER\Software\Classes\CLSID\{EED3317D-9BAF-E1A0-3530-53BD0421B01D}\Info
```
即表示运行成功。  

#### PS：有哪位小伙伴能帮忙打包个exe可执行文件，谢谢~！
