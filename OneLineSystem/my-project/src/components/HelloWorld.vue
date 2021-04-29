<template>
  <div class="HelloWorld">
    <el-input-number placeholder="income" size="100">yes</el-input-number>
    <div id="main"></div>
    <ul>
      <li>
        <a
          href="http://localhost:8080/index"
          target="_blank">
          test
        </a>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data: function () {
    return {
      message: 'Hello Vue.js!',
      x: [1, 2, 3, 2, 5]
    }
  },
  methods: {
    drawChart () {
      let myEchart = this.$echarts.init(document.getElementById('main'))
      let option = {
        title: {
          text: '营收额统计'
        },
        tooltip: {},
        legend: {
          data: ['销量']
        },
        xAxis: {
          type: 'category',
          data: ['1/11', '1/12', '1/13', '1/14']
        },
        yAxis: {},
        series: [{
          name: '销量',
          type: 'line',
          data: this.x
        }]
      }
      myEchart.setOption(option)
    }
  },
  mounted () {
    this.drawChart()
  }
}

</script>

<style scoped>
  #main {
    width: 600px;
    height:400px;
    margin: auto;
    margin-top: 100px
  }
</style>
