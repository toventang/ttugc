package com.p2082ss.android.ugc.aweme.tcm.impl.p4076b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73480az;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.e */
public final class C77751e extends C73480az implements C77731c.AbstractC77732a {

    /* renamed from: m */
    public ExtensionDataRepo f174350m;

    /* renamed from: n */
    private String f174351n;

    /* renamed from: o */
    private String f174352o;

    /* renamed from: p */
    private String f174353p = "0";

    /* renamed from: q */
    private AbstractC63199ax.AbstractC63200a f174354q;

    static {
        Covode.recordClassIndex(90811);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c.AbstractC77732a
    public final String getBrandedContentType() {
        return this.f174353p;
    }

    public final AbstractC63199ax.AbstractC63200a getPublishExtensionDataContainer() {
        return this.f174354q;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c.AbstractC77732a
    public final String getStarAtlasContent() {
        return this.f174352o;
    }

    public final String getStarAtlasHashTag() {
        return this.f174351n;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C77731c.f174314a = this;
    }

    public final ExtensionDataRepo getExtensionDataRepo() {
        ExtensionDataRepo extensionDataRepo = this.f174350m;
        if (extensionDataRepo == null) {
            C89219l.m154710a("extensionDataRepo");
        }
        return extensionDataRepo;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (C89219l.m154714a(C77731c.f174314a, this)) {
            C77731c.f174314a = null;
        }
    }

    public final void setPublishExtensionDataContainer(AbstractC63199ax.AbstractC63200a aVar) {
        this.f174354q = aVar;
    }

    public final void setStarAtlasHashTag(String str) {
        this.f174351n = str;
    }

    public final void setExtensionDataRepo(ExtensionDataRepo extensionDataRepo) {
        C89219l.m154721d(extensionDataRepo, "");
        this.f174350m = extensionDataRepo;
    }

    public C77751e(Context context) {
        super(context);
        setDrawableLeft(2131232431);
        setSubtitleMaxWidth(C34728n.m70946a(120.0d));
        C77739a.m135838a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c.AbstractC77732a
    public final void setBrandedContentType(String str) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        this.f174353p = str;
        if (C77746d.m135842a()) {
            Context context = getContext();
            String str3 = this.f174353p;
            if (TextUtils.equals(str3, "1") || TextUtils.equals(str3, "2")) {
                if (context != null) {
                    str2 = context.getString(R.string.g0c);
                } else {
                    str2 = null;
                }
            }
            setSubtitle(str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c.AbstractC77732a
    public final void setStarAtlasContent(String str) {
        boolean z;
        this.f174352o = str;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C77739a.m135838a(!z);
        if (!C77746d.m135842a()) {
            AbstractC63199ax.AbstractC63200a aVar = this.f174354q;
            String str2 = "";
            if (aVar != null) {
                PublishExtensionModel fromString = PublishExtensionModel.fromString(aVar.mo101676a());
                C89219l.m154716b(fromString, str2);
                fromString.isStarAtlas = true ^ TextUtils.isEmpty(getStarAtlasContent());
                fromString.starAtlasContent = str;
                aVar.mo101679a(PublishExtensionModel.toString(fromString));
            }
            if (!TextUtils.isEmpty(getStarAtlasContent())) {
                ExtensionDataRepo extensionDataRepo = this.f174350m;
                if (extensionDataRepo == null) {
                    C89219l.m154710a("extensionDataRepo");
                }
                extensionDataRepo.getAddStarAtlasTag().invoke();
            } else {
                ExtensionDataRepo extensionDataRepo2 = this.f174350m;
                if (extensionDataRepo2 == null) {
                    C89219l.m154710a("extensionDataRepo");
                }
                extensionDataRepo2.getRemoveStarAtlasTag().invoke();
            }
            Context context = getContext();
            if (!TextUtils.isEmpty(str)) {
                if (context != null) {
                    str2 = context.getString(R.string.g0c);
                } else {
                    str2 = null;
                }
            }
            setSubtitle(str2);
        }
    }
}
