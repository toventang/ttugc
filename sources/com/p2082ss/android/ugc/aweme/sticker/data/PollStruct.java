package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.PollStruct */
public class PollStruct implements Serializable {
    public List<OptionsBean> options;
    @AbstractC27891c(mo46611a = "vote_id")
    public long pollId;
    public String question;
    @AbstractC27891c(mo46611a = "ref_id")
    public long refId;
    @AbstractC27891c(mo46611a = "ref_type")
    public int refType;
    @AbstractC27891c(mo46611a = "select_option_id")
    public long selectOptionId;

    static {
        Covode.recordClassIndex(88217);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.PollStruct$OptionsBean */
    public static class OptionsBean implements Serializable {
        @AbstractC27891c(mo46611a = "option_id")
        public long optionId;
        @AbstractC27891c(mo46611a = "option_text")
        public String optionText;
        @AbstractC27891c(mo46611a = "vote_count")
        public long pollCount;
        @AbstractC27891c(mo46611a = "option")
        public String postOption;

        static {
            Covode.recordClassIndex(88218);
        }

        public long getOptionId() {
            return this.optionId;
        }

        public String getOptionText() {
            return this.optionText;
        }

        public long getPollCount() {
            return this.pollCount;
        }

        public String getPostOption() {
            return this.postOption;
        }

        public int hashCode() {
            return ((int) this.optionId) * 31;
        }

        public void setOptionId(long j) {
            this.optionId = j;
        }

        public void setOptionText(String str) {
            this.optionText = str;
        }

        public void setPollCount(long j) {
            this.pollCount = j;
        }

        public void setPostOption(String str) {
            this.postOption = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                OptionsBean optionsBean = (OptionsBean) obj;
                String str = this.optionText;
                if (str == null ? optionsBean.optionText != null : !str.equals(optionsBean.optionText)) {
                    return false;
                }
                if (this.optionId != optionsBean.optionId || this.pollCount != optionsBean.pollCount) {
                    return false;
                }
                String str2 = this.postOption;
                String str3 = optionsBean.postOption;
                if (str2 != null) {
                    return str2.equals(str3);
                }
                if (str3 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    public List<OptionsBean> getOptions() {
        return this.options;
    }

    public long getPollId() {
        return this.pollId;
    }

    public String getQuestion() {
        return this.question;
    }

    public long getRefId() {
        return this.refId;
    }

    public int getRefType() {
        return this.refType;
    }

    public long getSelectOptionId() {
        return this.selectOptionId;
    }

    public int hashCode() {
        return ((int) this.pollId) * 31;
    }

    public void setOptions(List<OptionsBean> list) {
        this.options = list;
    }

    public void setPollId(long j) {
        this.pollId = j;
    }

    public void setQuestion(String str) {
        this.question = str;
    }

    public void setRefId(long j) {
        this.refId = j;
    }

    public void setRefType(int i) {
        this.refType = i;
    }

    public void setSelectOptionId(long j) {
        this.selectOptionId = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PollStruct pollStruct = (PollStruct) obj;
            String str = this.question;
            if (str == null ? pollStruct.question != null : !str.equals(pollStruct.question)) {
                return false;
            }
            if (this.pollId != pollStruct.pollId || this.selectOptionId != pollStruct.selectOptionId) {
                return false;
            }
            List<OptionsBean> list = this.options;
            List<OptionsBean> list2 = pollStruct.options;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }
}
