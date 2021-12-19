package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.model.PureDataSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent */
public final class GroupInviteCardContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "expired_at")
    private Long expiredAt;
    @AbstractC27891c(mo46611a = "group")
    private C55371a group;
    @AbstractC27891c(mo46611a = "invite_id")
    private String inviteId;

    static {
        Covode.recordClassIndex(63435);
    }

    public static final GroupInviteCardContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63436);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final GroupInviteCardContent fromSharePackage(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            GroupInviteCardContent groupInviteCardContent = new GroupInviteCardContent();
            groupInviteCardContent.type = 103301;
            Bundle bundle = sharePackage.f155492i;
            groupInviteCardContent.setInviteId(bundle.getString("invite_id"));
            groupInviteCardContent.setExpiredAt(Long.valueOf(bundle.getLong("expired_at", 0)));
            Serializable serializable = bundle.getSerializable("group");
            if (!(serializable instanceof C55371a)) {
                serializable = null;
            }
            groupInviteCardContent.setGroup((C55371a) serializable);
            return groupInviteCardContent;
        }
    }

    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    public final C55371a getGroup() {
        return this.group;
    }

    public final String getInviteId() {
        return this.inviteId;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.C55965a.m101845a("group");
        Bundle bundle = a.f155492i;
        bundle.putString("invite_id", this.inviteId);
        Long l = this.expiredAt;
        if (l != null) {
            bundle.putLong("expired_at", l.longValue());
        }
        bundle.putSerializable("group", String.valueOf(this.group));
        return a;
    }

    public final void setExpiredAt(Long l) {
        this.expiredAt = l;
    }

    public final void setGroup(C55371a aVar) {
        this.group = aVar;
    }

    public final void setInviteId(String str) {
        this.inviteId = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getQuoteHint(Context context) {
        C89219l.m154721d(context, "");
        String string = context.getResources().getString(R.string.cfz);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C17867d.m33078a();
        if (z || z2) {
            String string = C17867d.m33078a().getString(R.string.a_f);
            C89219l.m154716b(string, "");
            return string;
        }
        String string2 = a.getString(R.string.fi5);
        C89219l.m154716b(string2, "");
        return string2;
    }
}
