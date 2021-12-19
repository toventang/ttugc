package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareWebContent */
public class ShareWebContent extends AbsShareWebContent {
    static {
        Covode.recordClassIndex(63477);
    }

    public boolean fromThirdShare() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("web");
        a.f155492i.putSerializable("thumb_url", getImage());
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.AbsShareWebContent, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return C17867d.m33078a().getString(R.string.cim, getTitle());
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cg1);
    }

    public static ShareWebContent fromSharePackage(SharePackage sharePackage) {
        ShareWebContent shareWebContent = new ShareWebContent();
        shareWebContent.setTitle(sharePackage.f155489f);
        shareWebContent.setDesc(sharePackage.f155490g);
        shareWebContent.setImage(sharePackage.f155492i.getString("thumb_url"));
        String string = sharePackage.f155492i.getString("url_for_im_share");
        if (TextUtils.isEmpty(string)) {
            string = sharePackage.f155491h;
        }
        shareWebContent.setUrl(string);
        shareWebContent.setPushDetail(sharePackage.f155489f);
        return shareWebContent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.AbsShareWebContent, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            return a.getString(R.string.a_h);
        }
        return a.getString(R.string.fi7);
    }
}
