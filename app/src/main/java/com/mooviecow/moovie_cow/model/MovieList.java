package com.mooviecow.moovie_cow.model;

import java.util.List;

public class MovieList {
    //I just want to take a minute here and thank the developers at google for creating GSON and the dude that
    //created the GSON setter getter auto creator
    //you guys are blessings and I can't thank you enough
    //I was here for weeks trying to write everything out with JSONObj and was getting no where
    //swapped to GSON and made more progress in a day than I had in 2 weeks.

    /**
     * page : 1
     * total_results : 19928
     * total_pages : 997
     * results : [{"vote_count":3872,"id":299536,"video":false,"vote_average":8.5,"title":"Avengers: Infinity War","popularity":484.692239,"poster_path":"/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg","original_language":"en","original_title":"Avengers: Infinity War","genre_ids":[12,878,14,28],"backdrop_path":"/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg","adult":false,"overview":"As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.","release_date":"2018-04-25"},{"vote_count":8,"id":510819,"video":false,"vote_average":2.9,"title":"Dirty Dead Con Men","popularity":480.835342,"poster_path":"/r70GGoZ5PqqokDDRnVfTN7PPDtJ.jpg","original_language":"en","original_title":"Dirty Dead Con Men","genre_ids":[28,80,18],"backdrop_path":"/75RJi3yVZnZtVj4Kn1bYGzkhiEx.jpg","adult":false,"overview":"A cool and dangerous neo-noir crime film that revolves around the disturbed lives of two unlikely partners: Mickey Rady, a rogue undercover cop and Kook Packard, a smooth and charismatic con man. Together they rip off those operating outside of the law...for their own personal gain. But things go awry when one heist suck them deep into a city-wide conspiracy...","release_date":"2018-03-30"},{"vote_count":1872,"id":337167,"video":false,"vote_average":6,"title":"Fifty Shades Freed","popularity":367.384884,"poster_path":"/jjPJ4s3DWZZvI4vw8Xfi4Vqa1Q8.jpg","original_language":"en","original_title":"Fifty Shades Freed","genre_ids":[18,10749],"backdrop_path":"/9ywA15OAiwjSTvg3cBs9B7kOCBF.jpg","adult":false,"overview":"Believing they have left behind shadowy figures from their past, newlyweds Christian and Ana fully embrace an inextricable connection and shared life of luxury. But just as she steps into her role as Mrs. Grey and he relaxes into an unfamiliar stability, new threats could jeopardize their happy ending before it even begins.","release_date":"2018-02-07"},{"vote_count":865,"id":383498,"video":false,"vote_average":8,"title":"Deadpool 2","popularity":303.43477,"poster_path":"/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg","original_language":"en","original_title":"Deadpool 2","genre_ids":[28,35,878],"backdrop_path":"/3P52oz9HPQWxcwHOwxtyrVV1LKi.jpg","adult":false,"overview":"Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life.","release_date":"2018-05-15"},{"vote_count":6350,"id":284053,"video":false,"vote_average":7.4,"title":"Thor: Ragnarok","popularity":200.167316,"poster_path":"/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg","original_language":"en","original_title":"Thor: Ragnarok","genre_ids":[28,12,14,878,35],"backdrop_path":"/kaIfm5ryEOwYg8mLbq8HkPuM1Fo.jpg","adult":false,"overview":"Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the prophecy of destruction to his homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.","release_date":"2017-10-25"},{"vote_count":5444,"id":284054,"video":false,"vote_average":7.3,"title":"Black Panther","popularity":188.584269,"poster_path":"/uxzzxijgPIY7slzFvMotPv8wjKA.jpg","original_language":"en","original_title":"Black Panther","genre_ids":[28,12,14,878],"backdrop_path":"/AlFqBwJnokrp9zWTXOUv7uhkaeq.jpg","adult":false,"overview":"King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.","release_date":"2018-02-13"},{"vote_count":14853,"id":293660,"video":false,"vote_average":7.5,"title":"Deadpool","popularity":126.47005,"poster_path":"/inVq3FRqcYIRl2la8iZikYYxFNR.jpg","original_language":"en","original_title":"Deadpool","genre_ids":[28,12,35],"backdrop_path":"/n1y094tVDFATSzkTnFxoGZ1qNsG.jpg","adult":false,"overview":"Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.","release_date":"2016-02-09"},{"vote_count":577,"id":427641,"video":false,"vote_average":5.9,"title":"Rampage","popularity":118.229382,"poster_path":"/30oXQKwibh0uANGMs0Sytw3uN22.jpg","original_language":"en","original_title":"Rampage","genre_ids":[28,12,878],"backdrop_path":"/wrqUiMXttHE4UBFMhLHlN601MZh.jpg","adult":false,"overview":"Primatologist Davis Okoye shares an unshakable bond with George, the extraordinarily intelligent, silverback gorilla who has been in his care since birth.  But a rogue genetic experiment gone awry mutates this gentle ape into a raging creature of enormous size.  To make matters worse, it\u2019s soon discovered there are other similarly altered animals.  As these newly created alpha predators tear across North America, destroying everything in their path, Okoye teams with a discredited genetic engineer to secure an antidote, fighting his way through an ever-changing battlefield, not only to halt a global catastrophe but to save the fearsome creature that was once his friend.","release_date":"2018-04-12"},{"vote_count":13043,"id":118340,"video":false,"vote_average":7.9,"title":"Guardians of the Galaxy","popularity":113.479172,"poster_path":"/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg","original_language":"en","original_title":"Guardians of the Galaxy","genre_ids":[28,878,12],"backdrop_path":"/bHarw8xrmQeqf3t8HpuMY7zoK4x.jpg","adult":false,"overview":"Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser.","release_date":"2014-07-30"},{"vote_count":1169,"id":401981,"video":false,"vote_average":6.4,"title":"Red Sparrow","popularity":101.566272,"poster_path":"/vLCogyfQGxVLDC1gqUdNAIkc29L.jpg","original_language":"en","original_title":"Red Sparrow","genre_ids":[9648,53],"backdrop_path":"/sGzuQYSTwJvLBc2PnuSVLHhuFeh.jpg","adult":false,"overview":"Prima ballerina, Dominika Egorova faces a bleak and uncertain future after she suffers an injury that ends her career. She soon turns to Sparrow School, a secret intelligence service that trains exceptional young people to use their minds and bodies as weapons. Dominika emerges as the most dangerous Sparrow after completing the sadistic training process. As she comes to terms with her new abilities, she meets a CIA agent who tries to convince her that he is the only person she can trust.","release_date":"2018-03-01"},{"vote_count":7261,"id":269149,"video":false,"vote_average":7.7,"title":"Zootopia","popularity":100.875189,"poster_path":"/sM33SANp9z6rXW8Itn7NnG1GOEs.jpg","original_language":"en","original_title":"Zootopia","genre_ids":[16,12,10751,35],"backdrop_path":"/mhdeE1yShHTaDbJVdWyTlzFvNkr.jpg","adult":false,"overview":"Determined to prove herself, Officer Judy Hopps, the first bunny on Zootopia's police force, jumps at the chance to crack her first case - even if it means partnering with scam-artist fox Nick Wilde to solve the mystery.","release_date":"2016-02-11"},{"vote_count":4481,"id":354912,"video":false,"vote_average":7.8,"title":"Coco","popularity":96.373626,"poster_path":"/eKi8dIrr8voobbaGzDpe8w0PVbC.jpg","original_language":"en","original_title":"Coco","genre_ids":[12,35,10751,16],"backdrop_path":"/askg3SMvhqEl4OL52YuvdtY40Yb.jpg","adult":false,"overview":"Despite his family\u2019s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.","release_date":"2017-10-27"},{"vote_count":8712,"id":297762,"video":false,"vote_average":7.2,"title":"Wonder Woman","popularity":91.709067,"poster_path":"/imekS7f1OuHyUP2LAiTEM0zBzUz.jpg","original_language":"en","original_title":"Wonder Woman","genre_ids":[28,12,14,10752,878],"backdrop_path":"/6iUNJZymJBMXXriQyFZfLAKnjO6.jpg","adult":false,"overview":"An Amazon princess comes to the world of Man in the grips of the First World War to confront the forces of evil and bring an end to human conflict.","release_date":"2017-05-30"},{"vote_count":21,"id":499772,"video":false,"vote_average":5.1,"title":"Meet Me In St. Gallen","popularity":89.194241,"poster_path":"/uGntNjUx6YAzbVy7RDgxWnWsdet.jpg","original_language":"tl","original_title":"Meet Me In St. Gallen","genre_ids":[18,10749],"backdrop_path":"/4QrbczSQGZQA7BG9xMhccQI7LHm.jpg","adult":false,"overview":"The story of Jesse and Celeste who meets at an unexpected time in their lives. They then realize their names are the same as the characters in the popular break-up romantic comedy, Celeste and Jesse Forever.","release_date":"2018-02-07"},{"vote_count":5484,"id":181808,"video":false,"vote_average":7.1,"title":"Star Wars: The Last Jedi","popularity":85.672733,"poster_path":"/kOVEVeg59E0wsnXmF9nrh6OmWII.jpg","original_language":"en","original_title":"Star Wars: The Last Jedi","genre_ids":[14,12,878],"backdrop_path":"/bIUaCtWaRgd78SnoHJDI8TNf7Sd.jpg","adult":false,"overview":"Rey develops her newly discovered abilities with the guidance of Luke Skywalker, who is unsettled by the strength of her powers. Meanwhile, the Resistance prepares to do battle with the First Order.","release_date":"2017-12-13"},{"vote_count":8233,"id":321612,"video":false,"vote_average":6.8,"title":"Beauty and the Beast","popularity":84.426594,"poster_path":"/tWqifoYuwLETmmasnGHO7xBjEtt.jpg","original_language":"en","original_title":"Beauty and the Beast","genre_ids":[10751,14,10749],"backdrop_path":"/6aUWe0GSl69wMTSWWexsorMIvwU.jpg","adult":false,"overview":"A live-action adaptation of Disney's version of the classic tale of a cursed prince and a beautiful young woman who helps him break the spell.","release_date":"2017-03-16"},{"vote_count":7877,"id":198663,"video":false,"vote_average":7,"title":"The Maze Runner","popularity":82.580215,"poster_path":"/coss7RgL0NH6g4fC2s5atvf3dFO.jpg","original_language":"en","original_title":"The Maze Runner","genre_ids":[28,9648,878,53],"backdrop_path":"/lkOZcsXcOLZYeJ2YxJd3vSldvU4.jpg","adult":false,"overview":"Set in a post-apocalyptic world, young Thomas is deposited in a community of boys after his memory is erased, soon learning they're all trapped in a maze that will require him to join forces with fellow \u201crunners\u201d for a shot at escape.","release_date":"2014-09-10"},{"vote_count":14786,"id":24428,"video":false,"vote_average":7.5,"title":"The Avengers","popularity":81.07842,"poster_path":"/cezWGskPY5x7GaglTTRN4Fugfb8.jpg","original_language":"en","original_title":"The Avengers","genre_ids":[878,28,12],"backdrop_path":"/hbn46fQaRmlpBuUrEiFqv0GDL6Y.jpg","adult":false,"overview":"When an unexpected enemy emerges and threatens global safety and security, Nick Fury, director of the international peacekeeping agency known as S.H.I.E.L.D., finds himself in need of a team to pull the world back from the brink of disaster. Spanning the globe, a daring recruitment effort begins!","release_date":"2012-04-25"},{"vote_count":651,"id":445571,"video":false,"vote_average":7,"title":"Game Night","popularity":75.456523,"poster_path":"/85R8LMyn9f2Lev2YPBF8Nughrkv.jpg","original_language":"en","original_title":"Game Night","genre_ids":[9648,35,80,53],"backdrop_path":"/nFQYnpri9kqJ91sG1IfyhukhdrD.jpg","adult":false,"overview":"Max and Annie's weekly game night gets kicked up a notch when Max's brother Brooks arranges a murder mystery party -- complete with fake thugs and federal agents. So when Brooks gets kidnapped, it's all supposed to be part of the game. As the competitors set out to solve the case, they start to learn that neither the game nor Brooks are what they seem to be. The friends soon find themselves in over their heads as each twist leads to another unexpected turn over the course of one chaotic night.","release_date":"2018-02-22"},{"vote_count":1967,"id":333339,"video":false,"vote_average":7.8,"title":"Ready Player One","popularity":75.4135,"poster_path":"/pU1ULUq8D3iRxl1fdX2lZIzdHuI.jpg","original_language":"en","original_title":"Ready Player One","genre_ids":[12,878,28],"backdrop_path":"/q7fXcrDPJcf6t3rzutaNwTzuKP1.jpg","adult":false,"overview":"When the creator of a popular video game system dies, a virtual contest is created to compete for his fortune.","release_date":"2018-03-28"}]
     */

    private int page;
    private int total_results;
    private int total_pages;
    private List<ResultsBean> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * vote_count : 3872
         * id : 299536
         * video : false
         * vote_average : 8.5
         * title : Avengers: Infinity War
         * popularity : 484.692239
         * poster_path : /7WsyChQLEftFiDOVTGkv3hFpyyt.jpg
         * original_language : en
         * original_title : Avengers: Infinity War
         * genre_ids : [12,878,14,28]
         * backdrop_path : /bOGkgRGdhrBYJSLpXaxhXVstddV.jpg
         * adult : false
         * overview : As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.
         * release_date : 2018-04-25
         */

        private int vote_count;
        private int id;
        private boolean video;
        private double vote_average;
        private String title;
        private double popularity;
        private String poster_path;
        private String original_language;
        private String original_title;
        private String backdrop_path;
        private boolean adult;
        private String overview;
        private String release_date;
        private List<Integer> genre_ids;

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }
    }
}
