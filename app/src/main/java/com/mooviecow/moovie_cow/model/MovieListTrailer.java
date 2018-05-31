package com.mooviecow.moovie_cow.model;

import java.util.List;

public class MovieListTrailer {

    /**
     * id : 383498
     * results : [{"id":"58cfd30ec3a36850fb033b0f","iso_639_1":"en","iso_3166_1":"US","key":"Z5ezsReZcxU","name":"No Good Deed","site":"YouTube","size":1080,"type":"Featurette"},{"id":"5a0c6034c3a36875e80144fc","iso_639_1":"en","iso_3166_1":"US","key":"2-5Wv9UGkN8","name":"Deadpool 2 | Official HD  Deadpool's \"Wet on Wet\" Teaser | 2018","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5a7b23169251411c58009cb5","iso_639_1":"en","iso_3166_1":"US","key":"xZNBFcwd7zc","name":"Deadpool, Meet Cable","site":"YouTube","size":1080,"type":"Teaser"},{"id":"5ab3b9339251417afb008f5b","iso_639_1":"en","iso_3166_1":"US","key":"D86RtevtfrA","name":"Deadpool 2 | The Trailer","site":"YouTube","size":1080,"type":"Trailer"},{"id":"5ad9f5220e0a2661fd00f4a0","iso_639_1":"en","iso_3166_1":"US","key":"20bpjtCbCz0","name":"Deadpool 2: The Final Trailer","site":"YouTube","size":1080,"type":"Trailer"},{"id":"5ad9f573c3a3683c9a00e22e","iso_639_1":"en","iso_3166_1":"US","key":"bI31WqFDxNs","name":"A Very Special Message from Deadpool","site":"YouTube","size":1080,"type":"Teaser"}]
     */

    private int id;
    private List<ResultsBean> results;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * id : 58cfd30ec3a36850fb033b0f
         * iso_639_1 : en
         * iso_3166_1 : US
         * key : Z5ezsReZcxU
         * name : No Good Deed
         * site : YouTube
         * size : 1080
         * type : Featurette
         */

        private String id;
        private String iso_639_1;
        private String iso_3166_1;
        private String key;
        private String name;
        private String site;
        private int size;
        private String type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIso_639_1() {
            return iso_639_1;
        }

        public void setIso_639_1(String iso_639_1) {
            this.iso_639_1 = iso_639_1;
        }

        public String getIso_3166_1() {
            return iso_3166_1;
        }

        public void setIso_3166_1(String iso_3166_1) {
            this.iso_3166_1 = iso_3166_1;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSite() {
            return site;
        }

        public void setSite(String site) {
            this.site = site;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
