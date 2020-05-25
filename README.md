# MedicalInsuranceReimbursementSystem
医疗保险报销系统  

### 系统介绍  
    该系统为医疗保险报销系统，其设计需求是：  
      1、对医疗基本信息和费用计算参数进行维护，实现信息的增删改查。  
      2、对参保人员的报销资格进行审核。  
      3、能完成医疗报销的费用计算过程，实现医疗报销。  
      4、系统操作灵活简单，运行安全高效，能满足医保中心报销的基本工作需求。  
      5、对重要的事件和不当操作提供警报，对重要数据进行加密。  
      6、具有良好的系统扩充能力。

### 系统设计  
#### 类图  
1、总体：  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p1.png" width="400"></div>  
2、基本信息维护模块（以病种信息为例）：  
![]("https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p2.png)
3、审批模块（以人员就诊机构审批为例）：  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p3.png" width="400"></div>  
4、中心报销模块（部分）：  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p4.png" width="400"></div>  
时序图：  
1、实现信息的增删改查（以药品信息为例）：  
药品信息增加：  
 <div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p5.png" width="400"></div>  
药品信息删除：  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p6.png" width="400"></div>  
药品信息修改：  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p7.png" width="400"></div>  
药品信息查找：  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p8.png" width="400"></div>  
2、打印结算单据：  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p9.png" width="400"></div>   
    
#### 持久化储存格式：  
药品信息.txt:  
#药品编码,药品名称,最高限价,剂量单位,审批标识,医院等级,收费等级  
Y345903,阿莫西林胶囊,12.6,0.25mg*24s/盒,否,三级,丙  
Y256734,阿司匹林肠溶片,20,100mg*30s/盒,否,二级,乙  
Y785673,甲状腺片,40.2,40mg*100s/瓶,否,二级,甲  
Y563728,索坦,15000,12.5mg*28/盒,是,一级,甲  
  
医疗待遇计算参数.txt:  
#医疗人员类别,封顶金额,起付标准,上限金额,下限金额,报销比例  
11,200000,100,10000,100,20%  
21,150000,100,20000,10001,10%  
40,120000,100,20001,999999999,5%  
41,100000, , , ,   
  
个人基本信息.txt:  
#ID,姓名,性别,人员类别,出生日期,证件类型,证件编号  
F00051238,黄家瑛,女, 40,1999/03/21,居民身份证,350802199903216544  
F00023143,冯少军,男, 11,1985/08/13,居民身份证,350802198508138769  
  
人员就诊信息.txt:  
#医疗机构编码,医疗机构名称,医疗类别,疾病编码,疾病名称,入院日期,出院日期  
F3521232,中国医科大学附属盛京医院,1,J1235432,肾癌,2018/04/21,2018/05/01  
  
处方明细信息.txt:  
#收费等级,项目类别,项目名称,单价,数量,金额  
甲,药品,索坦,12268,4,49072  
乙,诊疗,化疗,18,2,36  
丙,服务,床位费,30,30,900  
  
预结算信息txt:  
#费用总额,报销金额,自费金额,乙类项目自费金额,特检特治自费金额  
  
#### 图形界面化：  
1、	登陆界面：  
    ○1添加“医保logo”图片，使界面生动美观。  
    ○2添加“退出按钮”，点击“退出”时该界面关闭。  
    ○3背景颜色、字体、文本框颜色等进行了个性化设置，更加美观。  
    ○4对密码等保密信息设置为“不可见”。  
    ○5输入错误时，界面会出现相应提示。  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p10.png" width="400"></div>   
   
2、	医保报销系统主菜单：    
    ○1点击各个按钮可跳转到相应界面  
    ○2点击“返回”可返回登陆界面   
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p11.png" width="400"></div>   
   
3、	信息维护界面（以“药品信息维护”为例）：    
    ○1可实现增删改查功能。  
    ○2对于用于显示查找结果的文本框，设置了“inditable”使用户无法输入。  
    ○3输入对应信息后按“确定”可执行相应操作，输入错误会有报错框跳出。  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p12.png" width="400"></div>   
    
4、	医保中心报销界面  
    ○1可完成报销过程的各项功能。  
    ○2按照报销流程，自上而下操作完成报销过程。  
    ○3使用了comboBox，更加方便用户操作，更人性化。  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p14.png" width="400"></div>   
  
5、  报错提示  
<div align=center><img src="https://github.com/Geogy-fjq/MedicalInsuranceReimbursementSystem/tree/master/READMEPhoto/p13.png" width="400"></div> 
       
 
