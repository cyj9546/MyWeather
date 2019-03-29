package com.cyj.myweather.Bean;

import java.util.List;

public class WeatherBean {

    /**
     * status : 0
     * msg : ok
     * result : {"city":"广州","cityid":"75","citycode":"101280101","date":"2019-03-29","week":"星期五","weather":"阴","temp":"25","temphigh":"26","templow":"19","img":"2","humidity":"87","pressure":"1004","windspeed":"1.4","winddirect":"西南风","windpower":"1级","updatetime":"2019-03-29 13:50:00","index":[{"iname":"空调指数","ivalue":"较少开启","detail":"您将感到很舒适，一般不需要开启空调。"},{"iname":"运动指数","ivalue":"较不宜","detail":"有较强降水，建议您选择在室内进行健身休闲运动。"},{"iname":"紫外线指数","ivalue":"最弱","detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"iname":"感冒指数","ivalue":"较易发","detail":"天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"},{"iname":"洗车指数","ivalue":"不宜","detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"iname":"空气污染扩散指数","ivalue":"优","detail":"气象条件非常有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},{"iname":"穿衣指数","ivalue":"舒适","detail":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"}],"aqi":{"so2":"7","so224":"8","no2":"22","no224":"28","co":"0.540","co24":"0.590","o3":"69","o38":"42","o324":"42","pm10":"44","pm1024":"36","pm2_5":"20","pm2_524":"26","iso2":"6","ino2":"11","ico":"6","io3":"22","io38":"21","ipm10":"37","ipm2_5":"28","aqi":"37","primarypollutant":"PM10","quality":"优","timepoint":"2018-09-13 13:00:00","aqiinfo":{"level":"一级","color":"#00e400","affect":"空气质量令人满意，基本无空气污染","measure":"各类人群可正常活动"}},"daily":[{"date":"2019-03-29","week":"星期五","sunrise":"06:24","sunset":"18:41","night":{"weather":"小雨","templow":"19","img":"7","winddirect":"持续无风向","windpower":"微风"},"day":{"weather":"中雨","temphigh":"26","img":"8","winddirect":"持续无风向","windpower":"微风"}},{"date":"2019-03-30","week":"星期六","sunrise":"06:23","sunset":"18:42","night":{"weather":"小雨","templow":"20","img":"7","winddirect":"持续无风向","windpower":"微风"},"day":{"weather":"多云","temphigh":"27","img":"1","winddirect":"持续无风向","windpower":"微风"}},{"date":"2019-03-31","week":"星期日","sunrise":"06:22","sunset":"18:42","night":{"weather":"雷阵雨","templow":"18","img":"4","winddirect":"持续无风向","windpower":"微风"},"day":{"weather":"中雨","temphigh":"25","img":"8","winddirect":"持续无风向","windpower":"微风"}},{"date":"2019-04-01","week":"星期一","sunrise":"06:21","sunset":"18:42","night":{"weather":"多云","templow":"19","img":"1","winddirect":"东风","windpower":"3-5级"},"day":{"weather":"多云","temphigh":"22","img":"1","winddirect":"持续无风向","windpower":"微风"}},{"date":"2019-04-02","week":"星期二","sunrise":"06:20","sunset":"18:43","night":{"weather":"多云","templow":"20","img":"1","winddirect":"东风","windpower":"3-5级"},"day":{"weather":"多云","temphigh":"24","img":"1","winddirect":"东南风","windpower":"3-5级"}},{"date":"2019-04-03","week":"星期三","sunrise":"06:19","sunset":"18:43","night":{"weather":"阵雨","templow":"21","img":"3","winddirect":"东南风","windpower":"3-5级"},"day":{"weather":"多云","temphigh":"25","img":"1","winddirect":"东南风","windpower":"3-5级"}},{"date":"2019-04-04","week":"星期四","sunrise":"06:18","sunset":"18:43","night":{"weather":"小雨","templow":"18","img":"7","winddirect":"持续无风向","windpower":"微风"},"day":{"weather":"阵雨","temphigh":"26","img":"3","winddirect":"持续无风向","windpower":"微风"}}],"hourly":[{"time":"14:00","weather":"多云","temp":"27","img":"1"},{"time":"15:00","weather":"小雨","temp":"25","img":"7"},{"time":"16:00","weather":"小雨","temp":"25","img":"7"},{"time":"17:00","weather":"小雨","temp":"24","img":"7"},{"time":"18:00","weather":"小雨","temp":"24","img":"7"},{"time":"19:00","weather":"多云","temp":"24","img":"1"},{"time":"20:00","weather":"多云","temp":"23","img":"1"},{"time":"21:00","weather":"多云","temp":"23","img":"1"},{"time":"22:00","weather":"多云","temp":"23","img":"1"},{"time":"23:00","weather":"多云","temp":"22","img":"1"},{"time":"0:00","weather":"多云","temp":"22","img":"1"},{"time":"1:00","weather":"雷阵雨","temp":"21","img":"4"},{"time":"2:00","weather":"多云","temp":"21","img":"1"},{"time":"3:00","weather":"多云","temp":"21","img":"1"},{"time":"4:00","weather":"多云","temp":"21","img":"1"},{"time":"5:00","weather":"多云","temp":"21","img":"1"},{"time":"6:00","weather":"雷阵雨","temp":"20","img":"4"},{"time":"7:00","weather":"多云","temp":"21","img":"1"},{"time":"8:00","weather":"阴","temp":"22","img":"2"},{"time":"9:00","weather":"多云","temp":"23","img":"1"},{"time":"10:00","weather":"多云","temp":"24","img":"1"},{"time":"11:00","weather":"多云","temp":"25","img":"1"},{"time":"12:00","weather":"多云","temp":"26","img":"1"},{"time":"13:00","weather":"多云","temp":"26","img":"1"}]}
     */

    private String status;
    private String msg;
    private ResultBean result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * city : 广州
         * cityid : 75
         * citycode : 101280101
         * date : 2019-03-29
         * week : 星期五
         * weather : 阴
         * temp : 25
         * temphigh : 26
         * templow : 19
         * img : 2
         * humidity : 87
         * pressure : 1004
         * windspeed : 1.4
         * winddirect : 西南风
         * windpower : 1级
         * updatetime : 2019-03-29 13:50:00
         * index : [{"iname":"空调指数","ivalue":"较少开启","detail":"您将感到很舒适，一般不需要开启空调。"},{"iname":"运动指数","ivalue":"较不宜","detail":"有较强降水，建议您选择在室内进行健身休闲运动。"},{"iname":"紫外线指数","ivalue":"最弱","detail":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"iname":"感冒指数","ivalue":"较易发","detail":"天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。"},{"iname":"洗车指数","ivalue":"不宜","detail":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"iname":"空气污染扩散指数","ivalue":"优","detail":"气象条件非常有利于空气污染物稀释、扩散和清除，可在室外正常活动。"},{"iname":"穿衣指数","ivalue":"舒适","detail":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"}]
         * aqi : {"so2":"7","so224":"8","no2":"22","no224":"28","co":"0.540","co24":"0.590","o3":"69","o38":"42","o324":"42","pm10":"44","pm1024":"36","pm2_5":"20","pm2_524":"26","iso2":"6","ino2":"11","ico":"6","io3":"22","io38":"21","ipm10":"37","ipm2_5":"28","aqi":"37","primarypollutant":"PM10","quality":"优","timepoint":"2018-09-13 13:00:00","aqiinfo":{"level":"一级","color":"#00e400","affect":"空气质量令人满意，基本无空气污染","measure":"各类人群可正常活动"}}
         * daily : [{"date":"2019-03-29","week":"星期五","sunrise":"06:24","sunset":"18:41","night":{"weather":"小雨","templow":"19","img":"7","winddirect":"持续无风向","windpower":"微风"},"day":{"weather":"中雨","temphigh":"26","img":"8","winddirect":"持续无风向","windpower":"微风"}},{"date":"2019-03-30","week":"星期六","sunrise":"06:23","sunset":"18:42","night":{"weather":"小雨","templow":"20","img":"7","winddirect":"持续无风向","windpower":"微风"},"day":{"weather":"多云","temphigh":"27","img":"1","winddirect":"持续无风向","windpower":"微风"}},{"date":"2019-03-31","week":"星期日","sunrise":"06:22","sunset":"18:42","night":{"weather":"雷阵雨","templow":"18","img":"4","winddirect":"持续无风向","windpower":"微风"},"day":{"weather":"中雨","temphigh":"25","img":"8","winddirect":"持续无风向","windpower":"微风"}},{"date":"2019-04-01","week":"星期一","sunrise":"06:21","sunset":"18:42","night":{"weather":"多云","templow":"19","img":"1","winddirect":"东风","windpower":"3-5级"},"day":{"weather":"多云","temphigh":"22","img":"1","winddirect":"持续无风向","windpower":"微风"}},{"date":"2019-04-02","week":"星期二","sunrise":"06:20","sunset":"18:43","night":{"weather":"多云","templow":"20","img":"1","winddirect":"东风","windpower":"3-5级"},"day":{"weather":"多云","temphigh":"24","img":"1","winddirect":"东南风","windpower":"3-5级"}},{"date":"2019-04-03","week":"星期三","sunrise":"06:19","sunset":"18:43","night":{"weather":"阵雨","templow":"21","img":"3","winddirect":"东南风","windpower":"3-5级"},"day":{"weather":"多云","temphigh":"25","img":"1","winddirect":"东南风","windpower":"3-5级"}},{"date":"2019-04-04","week":"星期四","sunrise":"06:18","sunset":"18:43","night":{"weather":"小雨","templow":"18","img":"7","winddirect":"持续无风向","windpower":"微风"},"day":{"weather":"阵雨","temphigh":"26","img":"3","winddirect":"持续无风向","windpower":"微风"}}]
         * hourly : [{"time":"14:00","weather":"多云","temp":"27","img":"1"},{"time":"15:00","weather":"小雨","temp":"25","img":"7"},{"time":"16:00","weather":"小雨","temp":"25","img":"7"},{"time":"17:00","weather":"小雨","temp":"24","img":"7"},{"time":"18:00","weather":"小雨","temp":"24","img":"7"},{"time":"19:00","weather":"多云","temp":"24","img":"1"},{"time":"20:00","weather":"多云","temp":"23","img":"1"},{"time":"21:00","weather":"多云","temp":"23","img":"1"},{"time":"22:00","weather":"多云","temp":"23","img":"1"},{"time":"23:00","weather":"多云","temp":"22","img":"1"},{"time":"0:00","weather":"多云","temp":"22","img":"1"},{"time":"1:00","weather":"雷阵雨","temp":"21","img":"4"},{"time":"2:00","weather":"多云","temp":"21","img":"1"},{"time":"3:00","weather":"多云","temp":"21","img":"1"},{"time":"4:00","weather":"多云","temp":"21","img":"1"},{"time":"5:00","weather":"多云","temp":"21","img":"1"},{"time":"6:00","weather":"雷阵雨","temp":"20","img":"4"},{"time":"7:00","weather":"多云","temp":"21","img":"1"},{"time":"8:00","weather":"阴","temp":"22","img":"2"},{"time":"9:00","weather":"多云","temp":"23","img":"1"},{"time":"10:00","weather":"多云","temp":"24","img":"1"},{"time":"11:00","weather":"多云","temp":"25","img":"1"},{"time":"12:00","weather":"多云","temp":"26","img":"1"},{"time":"13:00","weather":"多云","temp":"26","img":"1"}]
         */

        private String city;
        private String cityid;
        private String citycode;
        private String date;
        private String week;
        private String weather;
        private String temp;
        private String temphigh;
        private String templow;
        private String img;
        private String humidity;
        private String pressure;
        private String windspeed;
        private String winddirect;
        private String windpower;
        private String updatetime;
        private AqiBean aqi;
        private List<IndexBean> index;
        private List<DailyBean> daily;
        private List<HourlyBean> hourly;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public String getCitycode() {
            return citycode;
        }

        public void setCitycode(String citycode) {
            this.citycode = citycode;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getTemphigh() {
            return temphigh;
        }

        public void setTemphigh(String temphigh) {
            this.temphigh = temphigh;
        }

        public String getTemplow() {
            return templow;
        }

        public void setTemplow(String templow) {
            this.templow = templow;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getPressure() {
            return pressure;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public String getWindspeed() {
            return windspeed;
        }

        public void setWindspeed(String windspeed) {
            this.windspeed = windspeed;
        }

        public String getWinddirect() {
            return winddirect;
        }

        public void setWinddirect(String winddirect) {
            this.winddirect = winddirect;
        }

        public String getWindpower() {
            return windpower;
        }

        public void setWindpower(String windpower) {
            this.windpower = windpower;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public AqiBean getAqi() {
            return aqi;
        }

        public void setAqi(AqiBean aqi) {
            this.aqi = aqi;
        }

        public List<IndexBean> getIndex() {
            return index;
        }

        public void setIndex(List<IndexBean> index) {
            this.index = index;
        }

        public List<DailyBean> getDaily() {
            return daily;
        }

        public void setDaily(List<DailyBean> daily) {
            this.daily = daily;
        }

        public List<HourlyBean> getHourly() {
            return hourly;
        }

        public void setHourly(List<HourlyBean> hourly) {
            this.hourly = hourly;
        }

        public static class AqiBean {
            /**
             * so2 : 7
             * so224 : 8
             * no2 : 22
             * no224 : 28
             * co : 0.540
             * co24 : 0.590
             * o3 : 69
             * o38 : 42
             * o324 : 42
             * pm10 : 44
             * pm1024 : 36
             * pm2_5 : 20
             * pm2_524 : 26
             * iso2 : 6
             * ino2 : 11
             * ico : 6
             * io3 : 22
             * io38 : 21
             * ipm10 : 37
             * ipm2_5 : 28
             * aqi : 37
             * primarypollutant : PM10
             * quality : 优
             * timepoint : 2018-09-13 13:00:00
             * aqiinfo : {"level":"一级","color":"#00e400","affect":"空气质量令人满意，基本无空气污染","measure":"各类人群可正常活动"}
             */

            private String so2;
            private String so224;
            private String no2;
            private String no224;
            private String co;
            private String co24;
            private String o3;
            private String o38;
            private String o324;
            private String pm10;
            private String pm1024;
            private String pm2_5;
            private String pm2_524;
            private String iso2;
            private String ino2;
            private String ico;
            private String io3;
            private String io38;
            private String ipm10;
            private String ipm2_5;
            private String aqi;
            private String primarypollutant;
            private String quality;
            private String timepoint;
            private AqiinfoBean aqiinfo;

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }

            public String getSo224() {
                return so224;
            }

            public void setSo224(String so224) {
                this.so224 = so224;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getNo224() {
                return no224;
            }

            public void setNo224(String no224) {
                this.no224 = no224;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getCo24() {
                return co24;
            }

            public void setCo24(String co24) {
                this.co24 = co24;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }

            public String getO38() {
                return o38;
            }

            public void setO38(String o38) {
                this.o38 = o38;
            }

            public String getO324() {
                return o324;
            }

            public void setO324(String o324) {
                this.o324 = o324;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getPm1024() {
                return pm1024;
            }

            public void setPm1024(String pm1024) {
                this.pm1024 = pm1024;
            }

            public String getPm2_5() {
                return pm2_5;
            }

            public void setPm2_5(String pm2_5) {
                this.pm2_5 = pm2_5;
            }

            public String getPm2_524() {
                return pm2_524;
            }

            public void setPm2_524(String pm2_524) {
                this.pm2_524 = pm2_524;
            }

            public String getIso2() {
                return iso2;
            }

            public void setIso2(String iso2) {
                this.iso2 = iso2;
            }

            public String getIno2() {
                return ino2;
            }

            public void setIno2(String ino2) {
                this.ino2 = ino2;
            }

            public String getIco() {
                return ico;
            }

            public void setIco(String ico) {
                this.ico = ico;
            }

            public String getIo3() {
                return io3;
            }

            public void setIo3(String io3) {
                this.io3 = io3;
            }

            public String getIo38() {
                return io38;
            }

            public void setIo38(String io38) {
                this.io38 = io38;
            }

            public String getIpm10() {
                return ipm10;
            }

            public void setIpm10(String ipm10) {
                this.ipm10 = ipm10;
            }

            public String getIpm2_5() {
                return ipm2_5;
            }

            public void setIpm2_5(String ipm2_5) {
                this.ipm2_5 = ipm2_5;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getPrimarypollutant() {
                return primarypollutant;
            }

            public void setPrimarypollutant(String primarypollutant) {
                this.primarypollutant = primarypollutant;
            }

            public String getQuality() {
                return quality;
            }

            public void setQuality(String quality) {
                this.quality = quality;
            }

            public String getTimepoint() {
                return timepoint;
            }

            public void setTimepoint(String timepoint) {
                this.timepoint = timepoint;
            }

            public AqiinfoBean getAqiinfo() {
                return aqiinfo;
            }

            public void setAqiinfo(AqiinfoBean aqiinfo) {
                this.aqiinfo = aqiinfo;
            }

            public static class AqiinfoBean {
                /**
                 * level : 一级
                 * color : #00e400
                 * affect : 空气质量令人满意，基本无空气污染
                 * measure : 各类人群可正常活动
                 */

                private String level;
                private String color;
                private String affect;
                private String measure;

                public String getLevel() {
                    return level;
                }

                public void setLevel(String level) {
                    this.level = level;
                }

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }

                public String getAffect() {
                    return affect;
                }

                public void setAffect(String affect) {
                    this.affect = affect;
                }

                public String getMeasure() {
                    return measure;
                }

                public void setMeasure(String measure) {
                    this.measure = measure;
                }
            }
        }

        public static class IndexBean {
            /**
             * iname : 空调指数
             * ivalue : 较少开启
             * detail : 您将感到很舒适，一般不需要开启空调。
             */

            private String iname;
            private String ivalue;
            private String detail;

            public String getIname() {
                return iname;
            }

            public void setIname(String iname) {
                this.iname = iname;
            }

            public String getIvalue() {
                return ivalue;
            }

            public void setIvalue(String ivalue) {
                this.ivalue = ivalue;
            }

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }
        }

        public static class DailyBean {
            /**
             * date : 2019-03-29
             * week : 星期五
             * sunrise : 06:24
             * sunset : 18:41
             * night : {"weather":"小雨","templow":"19","img":"7","winddirect":"持续无风向","windpower":"微风"}
             * day : {"weather":"中雨","temphigh":"26","img":"8","winddirect":"持续无风向","windpower":"微风"}
             */

            private String date;
            private String week;
            private String sunrise;
            private String sunset;
            private NightBean night;
            private DayBean day;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public NightBean getNight() {
                return night;
            }

            public void setNight(NightBean night) {
                this.night = night;
            }

            public DayBean getDay() {
                return day;
            }

            public void setDay(DayBean day) {
                this.day = day;
            }

            public static class NightBean {
                /**
                 * weather : 小雨
                 * templow : 19
                 * img : 7
                 * winddirect : 持续无风向
                 * windpower : 微风
                 */

                private String weather;
                private String templow;
                private String img;
                private String winddirect;
                private String windpower;

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getTemplow() {
                    return templow;
                }

                public void setTemplow(String templow) {
                    this.templow = templow;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getWinddirect() {
                    return winddirect;
                }

                public void setWinddirect(String winddirect) {
                    this.winddirect = winddirect;
                }

                public String getWindpower() {
                    return windpower;
                }

                public void setWindpower(String windpower) {
                    this.windpower = windpower;
                }
            }

            public static class DayBean {
                /**
                 * weather : 中雨
                 * temphigh : 26
                 * img : 8
                 * winddirect : 持续无风向
                 * windpower : 微风
                 */

                private String weather;
                private String temphigh;
                private String img;
                private String winddirect;
                private String windpower;

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getTemphigh() {
                    return temphigh;
                }

                public void setTemphigh(String temphigh) {
                    this.temphigh = temphigh;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getWinddirect() {
                    return winddirect;
                }

                public void setWinddirect(String winddirect) {
                    this.winddirect = winddirect;
                }

                public String getWindpower() {
                    return windpower;
                }

                public void setWindpower(String windpower) {
                    this.windpower = windpower;
                }
            }
        }

        public static class HourlyBean {
            /**
             * time : 14:00
             * weather : 多云
             * temp : 27
             * img : 1
             */

            private String time;
            private String weather;
            private String temp;
            private String img;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }
}
