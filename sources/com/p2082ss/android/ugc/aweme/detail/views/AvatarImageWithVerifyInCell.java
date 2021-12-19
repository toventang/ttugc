package com.p2082ss.android.ugc.aweme.detail.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.views.AvatarImageWithVerifyInCell */
public final class AvatarImageWithVerifyInCell extends AvatarImageWithVerify {

    /* renamed from: a */
    public static final C41429a f96653a = new C41429a((byte) 0);

    static {
        Covode.recordClassIndex(49324);
    }

    public AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.views.AvatarImageWithVerifyInCell$a */
    public static final class C41429a {
        static {
            Covode.recordClassIndex(49325);
        }

        private C41429a() {
        }

        public /* synthetic */ C41429a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify
    public final int getVerifyIconMarginEnd() {
        return -C34728n.m70946a(4.0d);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify
    public final int getVerifyIconSize() {
        return C34728n.m70946a(16.0d);
    }

    private /* synthetic */ AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AvatarImageWithVerifyInCell(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
