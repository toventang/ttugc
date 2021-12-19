package com.p2082ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.publish.IAVMentionEditText */
public interface IAVMentionEditText {
    static {
        Covode.recordClassIndex(79936);
    }

    void addHashTag(String str);

    boolean addMentionText(int i, String str, String str2, String str3, boolean z);

    List<TextExtraStruct> getStarAtlasExtraList();

    void removeHashTag();

    void removeStarAtlas();

    void setStarAtlasMentionTextColor(int i);
}
