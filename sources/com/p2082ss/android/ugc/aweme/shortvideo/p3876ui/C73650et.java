package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63174ah;
import com.p2082ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.et */
public final /* synthetic */ class C73650et implements AbstractC63174ah {

    /* renamed from: a */
    private final C73560cj f165480a;

    static {
        Covode.recordClassIndex(86388);
    }

    C73650et(C73560cj cjVar) {
        this.f165480a = cjVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63174ah
    /* renamed from: a */
    public final void mo101619a(String str, String str2) {
        C73560cj cjVar = this.f165480a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            cjVar.f165330e._nameText.setValue(str2);
            cjVar.f165336k = str2;
            cjVar.f165337l = str;
            cjVar.f165268K.playlist_id = cjVar.f165337l;
            cjVar.f165268K.playlist_name = cjVar.f165336k;
        } else if (!Boolean.valueOf(SplitVideoServiceImpl.m120147a().showPlayList()).booleanValue() || TextUtils.isEmpty(str2)) {
            cjVar.f165330e._nameText.setValue("");
            cjVar.f165337l = "";
            cjVar.f165336k = "";
            cjVar.f165268K.playlist_id = "";
            cjVar.f165268K.playlist_name = "";
        } else {
            cjVar.f165330e._nameText.setValue(str2);
            if (str2.equals(cjVar.getString(R.string.dpv))) {
                str2 = "playlist_default_name";
            }
            cjVar.f165336k = str2;
            cjVar.f165337l = "";
            cjVar.f165268K.playlist_id = cjVar.f165337l;
            cjVar.f165268K.playlist_name = cjVar.f165336k;
        }
    }
}
