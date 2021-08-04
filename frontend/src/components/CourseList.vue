<template>

<v-data-table
    :headers="headers"
    :items="courseList"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'CourseList',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "title", value: "title" },
            { text: "minEnroll", value: "minEnroll" },
            { text: "active", value: "active" },
        ],
        courseList : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/courselists')

      this.courseList = temp.data._embedded.courselists;

    },
    methods: {
    }
  }
</script>

