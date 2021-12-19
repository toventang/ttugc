package com.p2082ss.android.ugc.aweme.detail.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.views.AvatarImageWithVerifyMini */
public final class AvatarImageWithVerifyMini extends AvatarImageWithVerify {

    /* renamed from: a */
    public static final C41430a f96654a = new C41430a((byte) 0);

    static {
        Covode.recordClassIndex(49326);
    }

    public AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.views.AvatarImageWithVerifyMini$a */
    public static final class C41430a {
        static {
            Covode.recordClassIndex(49327);
        }

        private C41430a() {
        }

        public /* synthetic */ C41430a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify
    public final int getVerifyIconSize() {
        return (int) C13628n.m24520b(C17867d.m33078a(), 12.0f);
    }

    private /* synthetic */ AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
