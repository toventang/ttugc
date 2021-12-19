package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify */
public final class CommentAtAvaterWithVerify extends AvatarImageWithVerify {

    /* renamed from: a */
    public static final C36995a f87134a = new C36995a((byte) 0);

    static {
        Covode.recordClassIndex(44345);
    }

    public CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify$a */
    public static final class C36995a {
        static {
            Covode.recordClassIndex(44346);
        }

        private C36995a() {
        }

        public /* synthetic */ C36995a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify
    public final int getVerifyIconSize() {
        return (int) C13628n.m24520b(C17867d.m33078a(), 16.0f);
    }

    private /* synthetic */ CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
