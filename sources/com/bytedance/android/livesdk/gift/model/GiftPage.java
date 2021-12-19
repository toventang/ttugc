package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.C9914v;
import com.bytedance.android.livesdk.model.GiftOperation;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class GiftPage {
    @AbstractC27891c(mo46611a = "display")
    public boolean display;
    @AbstractC27891c(mo46611a = "event_name")
    public String eventName;
    @AbstractC27891c(mo46611a = "gifts")
    public List<C9904t> gifts;
    @AbstractC27891c(mo46611a = "page_operation")
    public GiftOperation operation;
    @AbstractC27891c(mo46611a = "page_name")
    public String pageName;
    @AbstractC27891c(mo46611a = "page_instruction")
    public C9914v pagePanelBanner;
    @AbstractC27891c(mo46611a = "page_type")
    public int pageType;

    static {
        Covode.recordClassIndex(9689);
    }
}
