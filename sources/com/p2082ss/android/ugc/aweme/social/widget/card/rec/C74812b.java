package com.p2082ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.b */
public final class C74812b extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C74813a f168140b = new C74813a((byte) 0);

    /* renamed from: a */
    public final PermissionCell<? extends C74808c> f168141a;

    static {
        Covode.recordClassIndex(87666);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.b$a */
    public static final class C74813a {
        static {
            Covode.recordClassIndex(87667);
        }

        private C74813a() {
        }

        public /* synthetic */ C74813a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74812b(PermissionCell<? extends C74808c> permissionCell, View view) {
        super(view);
        C89219l.m154721d(permissionCell, "");
        C89219l.m154721d(view, "");
        this.f168141a = permissionCell;
    }
}
