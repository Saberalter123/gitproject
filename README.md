# 我的一个android应用————hello.app
---
## ***采用线性布局，实现了页面的跳转、屏幕输出hello world和查看它的生命周期***
### 采用了linearLayout的布局方式，选用vertical布局
#### 第一个页面是activitymain页面
在页面顶部输出hello world,背景色为蓝色，页面中间输出‘This is my first android appliaction’的信息，点击页面右下角的按钮跳转到activity2页面
![image_01](https://github.com/Saberalter123/gitproject/blob/master/images/img_01.PNG)
#### 第二个页面是activity2页面
页面顶部显示该页面的信息，中部是一个可输入的文本框，点击右下角的按钮跳转回activitymain页面
![image_02](https://github.com/Saberalter123/gitproject/blob/master/images/img_02.PNG)
#### 我在Activity2.java页面中加入了OnResume、OnStrart等和生命周期有关的基本方法，并用log记录
![image_02](https://github.com/Saberalter123/gitproject/blob/master/images/img_03.PNG)
