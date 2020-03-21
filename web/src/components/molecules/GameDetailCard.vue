<template>
    <div class="container">
        <div class="detail-container">
            <h2 class="title">{{ title }}</h2>
            <hr>
            <p class="description">{{ description }}</p>
            <div class="detail">
                <span class="detail-text">対局数 : {{ gameCount }}</span>
                <span class="detail-text">部屋主 : {{ ownerName }}</span>
                <span class="detail-text">作成日 : {{ createdDate }}</span>
            </div>
        </div>
        <button class="button-container">
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

<style scoped>
.container {
    max-width: 500px;
}

.detail-container {
    border: 1px solid #dddddd;
    border-radius: 10px 10px 0px 0px;
    padding: 5px;
}

.title {
    margin: 0;
    text-align: left;
    padding: 5px;
}

.description {
    color: #888888;
    margin: 0px;
    padding: 10px 5px;
    text-align: left;
}

.detail {
    color: #888888;
    font-size: 12px;
    text-align: right;
}

.detail-text {
    padding: 0 5px;
}

.button-container {
    background-color: #68A4FF;
    width: 100%;
    color: white;
    padding: 5px;
    border: 1px solid #dddddd;
    border-top: none;
    border-radius: 0 0 10px 10px;
    font-size: 20px;
}
</style>