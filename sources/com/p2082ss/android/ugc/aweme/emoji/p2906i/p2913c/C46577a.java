package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.C46552b;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a.C46541a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a.p2908a.C46542a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a.p2909b.C46544a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.C46556a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.C46569d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.c.a */
public final class C46577a implements AbstractC46540a {

    /* renamed from: a */
    public static final C46578a f108600a = new C46578a((byte) 0);

    /* renamed from: b */
    private final AbstractC46540a f108601b;

    static {
        Covode.recordClassIndex(55164);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.c.a$a */
    public static final class C46578a {
        static {
            Covode.recordClassIndex(55165);
        }

        private C46578a() {
        }

        public /* synthetic */ C46578a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final int mo79100a() {
        return this.f108601b.mo79100a();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: b */
    public final String mo79106b() {
        return this.f108601b.mo79106b();
    }

    public C46577a() {
        boolean z;
        AbstractC46540a bVar;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean disableOnlineSmallEmoji = iESSettingsProxy.getDisableOnlineSmallEmoji();
            C89219l.m154716b(disableOnlineSmallEmoji, "");
            z = disableOnlineSmallEmoji.booleanValue();
        } catch (C16041a unused) {
            z = false;
        }
        if (((Boolean) C46542a.f108521a.getValue()).booleanValue()) {
            bVar = new C46541a((C46544a) C46544a.f108526c.getValue());
        } else if (z || !C46569d.m89879c()) {
            bVar = new C46552b();
        } else {
            bVar = new C46556a();
        }
        this.f108601b = bVar;
        C51423a.m95791b(3, null, "EmojiResHelper disableOnline=" + z + ", mAdapter=" + bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final Drawable mo79101a(Context context) {
        return this.f108601b.mo79101a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final boolean mo79105a(String str) {
        return this.f108601b.mo79105a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final Drawable mo79102a(Context context, String str) {
        return this.f108601b.mo79102a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final List<C46447a> mo79103a(int i, int i2) {
        return this.f108601b.mo79103a(i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2906i.AbstractC46540a
    /* renamed from: a */
    public final void mo79104a(RemoteImageView remoteImageView, C46447a aVar) {
        this.f108601b.mo79104a(remoteImageView, aVar);
    }
}
