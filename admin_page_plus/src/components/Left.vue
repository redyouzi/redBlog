<template>
  <div class="left">
    <div class="nav">
      <div class="user-info">
        <img class="avatar" src="../image/avatar.png" alt="" />
        <div class="username">
          <el-button type="primary" size="mini" round>root 管理员</el-button>
        </div>
        <el-button @click="logout" type="danger" size="mini" round
          >注销</el-button
        >
      </div>
      <router-link class="home common" to="/home">
        <i class="el-icon-s-home"></i>
        首页
      </router-link>
      <router-link class="common" to="/blog">
        <i class="el-icon-edit"></i>
        管理博客
      </router-link>
      <router-link class="common" to="/me">
        <i class="el-icon-user"></i>
        个人中心
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: "Left",
  data() {
    return {};
  },
  methods: {
    logout() {
      this.$confirm("确定要注销吗？", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      })
        .then(() => {
          localStorage.removeItem("token");
          this.$message({
            type: "success",
            message: "注销成功!",
          });
          this.$router.replace("/login");
        })
        .catch(() => {
          this.$message({
            type: "info",
            message: "已取消注销",
          });
        });
    },
  },
};
</script>

<style scoped>
.left {
  flex: 2;
  height: 100%;
  overflow: auto;
  background: url("../image/room.jpg") center;
  background-size: auto 100%;
  margin-right: 20px;
  box-shadow: 6px 0 10px 6px rgba(0, 0, 0, 0.2);
}
.left .nav {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 70%;
  text-align: center;
}
.nav .user-info .avatar {
  width: 100px;
  border-radius: 50%;
}

.nav .common {
  margin-top: 8px;
  width: 80%;
  height: 80px;
  font-size: 26px;
  line-height: 80px;
  /* background-color: #ccc; */
  color: #fff;
  /* border-radius: 50%; */
}
.nav .common:hover {
  border: 1px solid skyblue;
  /* background-color: skyblue; */
}
.nav .common:focus {
  color: skyblue;
  border: 1px solid skyblue;
}
.nav .home {
  margin-top: 100px;
}
</style>
