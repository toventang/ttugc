package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent */
public final class ShareSearchContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "desc")
    private String desc;
    @AbstractC27891c(mo46611a = "image")
    private String image;
    @AbstractC27891c(mo46611a = "schema")
    private String schema;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = "url")
    private String url;

    static {
        Covode.recordClassIndex(63470);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63471);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final ShareSearchContent fromSharePackage(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            ShareSearchContent shareSearchContent = new ShareSearchContent();
            shareSearchContent.setTitle(sharePackage.f155489f);
            shareSearchContent.setDesc(sharePackage.f155490g);
            shareSearchContent.setImage(sharePackage.f155492i.getString("thumb_url"));
            shareSearchContent.setSchema(sharePackage.f155492i.getString("schema"));
            String string = sharePackage.f155492i.getString("url_for_im_share");
            if (TextUtils.isEmpty(string)) {
                string = sharePackage.f155491h;
            }
            shareSearchContent.setUrl(string);
            return shareSearchContent;
        }
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("search");
        Bundle bundle = a.f155492i;
        String str = this.image;
        if (str == null) {
            str = "";
        }
        bundle.putSerializable("thumb_url", str);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        Context a = C17867d.m33078a();
        Object[] objArr = new Object[1];
        String str = this.title;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        String string = a.getString(R.string.cim, objArr);
        C89219l.m154716b(string, "");
        return string;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        Context a = C17867d.m33078a();
        if (z || z2) {
            str2 = a.getString(R.string.a_h);
        } else {
            str2 = a.getString(R.string.fi7);
        }
        C89219l.m154716b(str2, "");
        return str2;
    }
}
