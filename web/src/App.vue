<template>
  <div id="app">
    <GameCard
      title='まとののちんちん部屋'
      description='適当な説明文'
      ownerName='ExampleUser'
      gameCount=1
      createdDate='2020/10/24'
    />
  </div>
</template>

<script>
import GameCard from '@/components/molecules/GameDetailCard'

export default {
  name: 'App',
  components: {
    GameCard
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
