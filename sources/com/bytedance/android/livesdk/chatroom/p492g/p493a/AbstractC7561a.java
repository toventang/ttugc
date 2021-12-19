package com.bytedance.android.livesdk.chatroom.p492g.p493a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.a.a */
public abstract class AbstractC7561a implements AbstractC7563b {

    /* renamed from: b */
    public static final C7562a f18773b = new C7562a((byte) 0);

    /* renamed from: a */
    private int f18774a = C7564c.f18775a;

    static {
        Covode.recordClassIndex(8334);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.g.a.a$a */
    public static final class C7562a {
        static {
            Covode.recordClassIndex(8335);
        }

        private C7562a() {
        }

        public /* synthetic */ C7562a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p492g.p493a.AbstractC7563b
    /* renamed from: b */
    public final int mo13810b() {
        return this.f18774a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(AbstractC7563b bVar) {
        AbstractC7563b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        return this.f18774a - bVar2.mo13810b();
    }
}
