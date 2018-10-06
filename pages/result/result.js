// pages/result/result.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    iq:"",
    des:""
  },

 
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    
   
    this.setData({
      A: getApp().globalData.rightA,
      B: getApp().globalData.rightB,
      C: getApp().globalData.rightC,
      D: getApp().globalData.rightD,
      E: getApp().globalData.rightE,
      iq: getApp().globalData.iq,
      des: getApp().globalData.des
    })
  },
  
  
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
  ,
  
  begin: function () {     //开始训练按钮跳转事件
  
    
      //关闭所有界面并打开新的
      wx.reLaunch({
      url: '../index/index',
      success: function (res) {
        //清空之前的答题数据
        getApp().globalData.rightnum = 0
        getApp().globalData.rightA = 0
        getApp().globalData.rightB = 0
        getApp().globalData.rightC = 0
        getApp().globalData.rightD = 0
        getApp().globalData.rightE = 0
        getApp().globalData.key = 0
       },
      fail: function (res) { },
      complete: function (res) { },

    })
     
    
  },
})