package com.example.mymall.ui.own.bean;

import java.util.List;

public class AdressBean {

    /**
     * errno : 0
     * errmsg :
     * data : [{"id":39,"parent_id":4,"name":"石家庄市","type":2,"agency_id":0},{"id":40,"parent_id":4,"name":"唐山市","type":2,"agency_id":0},{"id":41,"parent_id":4,"name":"秦皇岛市","type":2,"agency_id":0},{"id":42,"parent_id":4,"name":"邯郸市","type":2,"agency_id":0},{"id":43,"parent_id":4,"name":"邢台市","type":2,"agency_id":0},{"id":44,"parent_id":4,"name":"保定市","type":2,"agency_id":0},{"id":45,"parent_id":4,"name":"张家口市","type":2,"agency_id":0},{"id":46,"parent_id":4,"name":"承德市","type":2,"agency_id":0},{"id":47,"parent_id":4,"name":"沧州市","type":2,"agency_id":0},{"id":48,"parent_id":4,"name":"廊坊市","type":2,"agency_id":0},{"id":49,"parent_id":4,"name":"衡水市","type":2,"agency_id":0}]
     */

    private int errno;
    private String errmsg;
    private List<DataBean> data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 39
         * parent_id : 4
         * name : 石家庄市
         * type : 2
         * agency_id : 0
         */

        private int id;
        private int parent_id;
        private String name;
        private int type;
        private int agency_id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getAgency_id() {
            return agency_id;
        }

        public void setAgency_id(int agency_id) {
            this.agency_id = agency_id;
        }
    }
}
