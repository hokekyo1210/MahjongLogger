<template>
    <div>
        <h1>{{ title }}</h1>
        <p>{{ description }}</p>
        <div>
            <span>現在の対局数 : {{ gameCount }}</span>
            <span>部屋主 : {{ ownerName }}</span>
            <span>作成日 : {{ createdDate }}</span>
        </div>
        <button>
            Join
        </button>
    </div>
</template>

<script>
export default {
    props: {
        title: String,
        ownerName: String,
        description: String,
        roomId: Number,
        gameCount: Number,
        createdDate: Date,
    }
}
</script>

<style>

</style>