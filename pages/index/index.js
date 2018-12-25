//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    motto: '瑞文标准智力测验',
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo')
  },
  
  //获取服务器数据
  



  //事件处理函数
 
  onLoad: function () {
    
   // wx.navigateBack({
     //   delta:4,
      //})
    

    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse){
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
  },
  getUserInfo: function(e) {
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },

begin: function(){     //开始训练，加载题目按钮跳转事件
for (var i = 0; i < 60; i++) {
    getApp().globalData.problem[i].items = [];//选项清空
  console.log(getApp().globalData.problem[i].items);
    }


    
    wx.request({
      url: 'https://gaoyuxuan.club/IQTest/SelectIQQuestion',//获取服务器数据
      header: {
        'Content-Type': 'application/json'
      },
      success: function (res) {

        for (var i = 0; i < 60; i++) {
          getApp().globalData.problem[i].question = res.data.problem[i].question;
          for (var j = 0; j < 8; j++) {
            if (j == 0) {
              if (res.data.problem[i].A != "") {
                var obj = [res.data.problem[i].A, 'A'];
                getApp().globalData.problem[i].items.push(obj);
              }
            }
            if (j == 1) {
              if (res.data.problem[i].B != "") {
                var obj = [res.data.problem[i].B, 'B'];
                getApp().globalData.problem[i].items.push(obj);
              }
            }
            if (j == 2) {
              if (res.data.problem[i].C != "") {
                var obj = [res.data.problem[i].C, 'C'];
                getApp().globalData.problem[i].items.push(obj);
              }
            }
            if (j == 3) {
              if (res.data.problem[i].D != "") {
                var obj = [res.data.problem[i].D, 'D'];
                getApp().globalData.problem[i].items.push(obj);
              }
            }
            if (j == 4) {
              if (res.data.problem[i].E != "") {
                var obj = [res.data.problem[i].E, 'E'];
                getApp().globalData.problem[i].items.push(obj);
              }
            }
            if (j == 5) {
              if (res.data.problem[i].F != "") {
                var obj = [res.data.problem[i].F, 'F'];
                getApp().globalData.problem[i].items.push(obj);
              }
            }
            if (j == 6) {
              if (res.data.problem[i].G != "") {
                var obj = [res.data.problem[i].G, 'G'];
                getApp().globalData.problem[i].items.push(obj);
              }
            }
            if (j == 7) {
              if (res.data.problem[i].H != "") {
                var obj = [res.data.problem[i].H, 'H'];
                getApp().globalData.problem[i].items.push(obj);
              }
            }

          }
          getApp().globalData.problem[i].rightAnswer = res.data.problem[i].answer;
          getApp().globalData.problem[i].type = res.data.problem[i].type;
        }
      }
    })
    
    console.log(getApp().globalData.problem);
    
    wx.navigateTo({

      url: '../introduce/introduce',
      success: function(res) {},
      fail: function(res) {},
      complete: function(res) {},
    })
   }
})