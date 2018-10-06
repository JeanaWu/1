// pages/problem/proble.js
Page({
   // bindViewTap: function(){
    //wx.navigateBack({
      //url: 'question?id=1'
    //})

  //},
  /**
   * 页面的初始数据
   */
  data: {
   now:0,
    items: null,
    questions: null,
    answer: null
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    
    this.setData({
    question:getApp().globalData.problem[this.data.now].question,
    items:getApp().globalData.problem[this.data.now].items,
    answer: getApp().globalData.problem[this.data.now].rightAnswer,
     now: getApp().globalData.key
   
    })
  },

 
  
     /* 题目和选项的图片加载
     */
  imageLoad: function (e) {
    var _this = this;
    var $width = e.detail.width, //获取图片真实宽度
      $height = e.detail.height,
      ratio = $width / $height;  //图片的真实宽高比例
    var viewWidth = 700,      //设置图片显示宽度
      viewHeight = 700 / ratio   //计算高度值
    this.setData({
      imageWidth: viewWidth,
      imageHeight: viewHeight,
    })
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

  },


  nextByView: function (e) {
    //判断题目组别以及答案正确性
  
    if (this.data.now<12){
     if (e.target.dataset.text == this.data.answer){
          
          getApp().globalData.rightnum = parseInt(getApp().globalData.rightnum) + 1;
          getApp().globalData.rightA = parseInt(getApp().globalData.rightA) + 1;
        }
  
      } 
    else if (this.data.now<24){
     if (e.target.dataset.text == this.data.answer) {

        getApp().globalData.rightnum = parseInt(getApp().globalData.rightnum) + 1;
        getApp().globalData.rightB = parseInt(getApp().globalData.rightB) + 1;
      }
     }
    else if (this.data.now<36){
     if (e.target.dataset.text == this.data.answer) {

        getApp().globalData.rightnum = parseInt(getApp().globalData.rightnum) + 1;
        getApp().globalData.rightC = parseInt(getApp().globalData.rightC) + 1;
      }
      }
    else if (this.data.now<48){
     if (e.target.dataset.text ==this.data.answer) {

        getApp().globalData.rightnum = parseInt(getApp().globalData.rightnum) + 1;
        getApp().globalData.rightD = parseInt(getApp().globalData.rightD) + 1;
      }
        }
    else if (this.data.now<60){
     if (e.target.dataset.text == this.data.answer) {

        getApp().globalData.rightnum = parseInt(getApp().globalData.rightnum) + 1;
        getApp().globalData.rightE = parseInt(getApp().globalData.rightE) + 1;
        }
      }
     else { //跳出结果页面
         wx.navigateTo({
         url: '../result/result'
       })
     }

   
    this.setData({
      now:this.data.now+1
    })
    
    if(this.data.now<60){
       this.setData({
         items: getApp().globalData.problem[this.data.now].items,
         question: getApp().globalData.problem[this.data.now].question,
         answer: getApp().globalData.problem[this.data.now].rightAnswer
       })
    }else{
      wx.request({
        url: 'https://gaoyuxuan.club/IQTest/scoreController?age=' + getApp().globalData.age + '&num=' + getApp().globalData.rightnum,
        data: {
          'age': getApp().globalData.age,
          'num': getApp().globalData.rightnum
        },
        header: {
          'Content-Type': 'application/json'
        },
        success: function (res) {
          getApp().globalData.des = res.data.des
          getApp().globalData.iq = res.data.iq
          wx.navigateTo({
            url: '../result/result'
          })
        }
      })
    }
  }


})