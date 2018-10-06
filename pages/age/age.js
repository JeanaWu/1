// pages/age/age.js
Page({
  
  /**
   * 页面的初始数据
   */
  data: {
    items: [
      { name: '17', value: '17~19岁' },
      { name: '20', value: '20~29岁' },
      { name: '30', value: '30~39岁' },
      { name: '40', value: '40~49岁' },
      { name: '50', value: '50~59岁' },
      { name: '60', value: '60~69岁' },
      { name: '70', value: '70~79岁' },
      { name: '16.5', value: '16岁' },
      { name: '16', value: '15岁9个月1天~16岁2个月30天' },
      { name: '15.5', value: '15岁3个月1天~15岁8个月30天' },
      { name: '15', value: '14岁9个月1天~15岁2个月30天' },
      { name: '14.5', value: '14岁3个月1天~14岁8个月30天' },
      { name: '14', value: '13岁9个月1天~14岁2个月30天' },
      { name: '13.5', value: '13岁3个月1天~13岁8个月30天' },
      { name: '13', value: '12岁9个月1天~13岁2个月30天' },
      { name: '12.5', value: '12岁3个月1天~12岁8个月30天' },
      { name: '12', value: '11岁9个月1天~12岁2个月30天' },
      { name: '11.5', value: '11岁3个月1天~11岁8个月30天' },
      { name: '11', value: '10岁9个月1天~11岁2个月30天' },
      { name: '10.5', value: '10岁3个月1天~10岁8个月30天' },
      { name: '10', value: '9岁9个月1天~10岁2个月30天' },
      { name: '9.5', value: '9岁3个月1天~9岁8个月30天' },
      { name: '9', value: '8岁9个月1天~9岁2个月30天' },
      { name: '8.5', value: '8岁3个月1天~8岁8个月30天' },
      { name: '8', value: '7岁9个月1天~8岁2个月30天' },
      { name: '7.5', value: '7岁3个月1天~7岁8个月30天' },
      { name: '7', value: '6岁9个月1天~7岁2个月30天' },
      { name: '6.5', value: '6岁3个月1天~6岁8个月30天' },
      { name: '6', value: '5岁9个月1天~6岁2个月30天' },
      { name: '5.5', value: '5岁3个月1天~5岁8个月30天' },

    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

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

  },
  
  
  radioChange: function (e) {
   // console.log('radio发生change事件，携带value值为：', e.detail.value)
   //获取答题年龄
   
      getApp().globalData.age= e.detail.value;
   //跳转做题界面
      wx.navigateTo({
      url: '../question/question',
      success: function (res) { },
      fail: function (res) { },
      complete: function (res) { },
    })


  }
})