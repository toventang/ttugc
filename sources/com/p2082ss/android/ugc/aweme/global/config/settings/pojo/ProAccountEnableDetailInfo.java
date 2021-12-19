package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo */
public class ProAccountEnableDetailInfo {
    @AbstractC27891c(mo46611a = "can_set_pro_g")
    private Boolean canSetProaccountGender;
    @AbstractC27891c(mo46611a = "category_list")
    private List<CategoryStruct> categoryList = new ArrayList();
    @AbstractC27891c(mo46611a = "category_page_text")
    private CategoryPageTextStruct categoryPageText;
    @AbstractC27891c(mo46611a = "is_proaccount_display")
    private Integer isProaccountDisplay;
    @AbstractC27891c(mo46611a = "siwa_skip_bind")
    private Boolean siwaSkipBind;
    @AbstractC27891c(mo46611a = "welcome_page_list")
    private List<WelcomePageTextStruct> welcomePageList = new ArrayList();

    static {
        Covode.recordClassIndex(62381);
    }

    public List<CategoryStruct> getCategoryList() {
        return this.categoryList;
    }

    public List<WelcomePageTextStruct> getWelcomePageList() {
        return this.welcomePageList;
    }

    public Boolean getCanSetProaccountGender() {
        Boolean bool = this.canSetProaccountGender;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public CategoryPageTextStruct getCategoryPageText() {
        CategoryPageTextStruct categoryPageTextStruct = this.categoryPageText;
        if (categoryPageTextStruct != null) {
            return categoryPageTextStruct;
        }
        throw new C16041a();
    }

    public Integer getIsProaccountDisplay() {
        Integer num = this.isProaccountDisplay;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Boolean getSiwaSkipBind() {
        Boolean bool = this.siwaSkipBind;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
