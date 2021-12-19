package com.bytedance.android.livesdk.chatroom.backroom;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.chatroom.backroom.p483b.AbstractC7336a;
import com.bytedance.android.livesdk.chatroom.backroom.p486e.AbstractC7351b;
import com.bytedance.android.livesdk.chatroom.backroom.p487f.C7353a;
import com.bytedance.android.livesdk.chatroom.backroom.p487f.C7354b;
import com.bytedance.android.livesdk.watch.chatroom.AbstractC11323a;
import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.backroom.a */
public final class C7330a implements AbstractC11323a {

    /* renamed from: a */
    public static final C7331a f18198a = new C7331a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f18199b = C89250i.m154773a((AbstractC89171a) C7332b.f18202a);

    /* renamed from: c */
    private final List<AbstractC7336a> f18200c;

    /* renamed from: d */
    private final List<AbstractC7351b> f18201d;

    static {
        Covode.recordClassIndex(8094);
    }

    /* renamed from: d */
    private final Stack<EnterRoomConfig> m15227d() {
        return (Stack) this.f18199b.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.a$a */
    public static final class C7331a {
        static {
            Covode.recordClassIndex(8095);
        }

        private C7331a() {
        }

        public /* synthetic */ C7331a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.a$b */
    static final class C7332b extends AbstractC89220m implements AbstractC89171a<Stack<EnterRoomConfig>> {

        /* renamed from: a */
        public static final C7332b f18202a = new C7332b();

        static {
            Covode.recordClassIndex(8096);
        }

        C7332b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Stack<EnterRoomConfig> invoke() {
            return new Stack();
        }
    }

    @Override // com.bytedance.android.livesdk.watch.chatroom.AbstractC11323a
    /* renamed from: c */
    public final int mo13570c() {
        return m15227d().size();
    }

    @Override // com.bytedance.android.livesdk.watch.chatroom.AbstractC11323a
    /* renamed from: b */
    public final EnterRoomConfig mo13569b() {
        Stack<EnterRoomConfig> d = m15227d();
        if (!(!d.isEmpty()) || d == null) {
            return null;
        }
        return d.pop();
    }

    @Override // com.bytedance.android.livesdk.watch.chatroom.AbstractC11323a
    /* renamed from: a */
    public final EnterRoomConfig mo13567a() {
        Stack<EnterRoomConfig> d = m15227d();
        if (!(!d.isEmpty()) || d == null) {
            return null;
        }
        return d.peek();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.chatroom.backroom.b.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.chatroom.backroom.e.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7330a(List<? extends AbstractC7336a> list, List<? extends AbstractC7351b> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f18200c = list;
        this.f18201d = list2;
    }

    /* renamed from: a */
    private final EnterRoomConfig m15226a(EnterRoomConfig enterRoomConfig, StackContext stackContext) {
        Iterator<T> it = this.f18201d.iterator();
        while (it.hasNext()) {
            it.next().mo13583a(enterRoomConfig, stackContext);
        }
        return enterRoomConfig;
    }

    @Override // com.bytedance.android.livesdk.watch.chatroom.AbstractC11323a
    /* renamed from: a */
    public final void mo13568a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        EnterRoomConfig enterRoomConfig3;
        String str;
        String str2;
        int i;
        String str3;
        long j;
        C89219l.m154721d(stackContext, "");
        String str4 = null;
        if (enterRoomConfig != null) {
            Iterator<T> it = this.f18200c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo13572a(enterRoomConfig, enterRoomConfig2, stackContext)) {
                        break;
                    }
                } else {
                    enterRoomConfig3 = enterRoomConfig;
                    break;
                }
            }
            enterRoomConfig3 = null;
        } else {
            enterRoomConfig3 = null;
        }
        if (enterRoomConfig3 == null) {
            C3854a.m9453a(4, "LiveBackRoomStack", "abort push to stack, filtered by at least one of " + this.f18200c);
            return;
        }
        C89219l.m154721d(enterRoomConfig, "");
        EnterRoomConfig enterRoomConfig4 = new EnterRoomConfig();
        enterRoomConfig4.f28233c.f28301R = enterRoomConfig.f28233c.f28301R;
        enterRoomConfig4.f28233c.f28287D = enterRoomConfig.f28233c.f28287D;
        enterRoomConfig4.f28233c.f28293J = enterRoomConfig.f28233c.f28293J;
        enterRoomConfig4.f28233c.f28295L = enterRoomConfig.f28233c.f28295L;
        enterRoomConfig4.f28233c.f28307X = enterRoomConfig.f28233c.f28307X;
        enterRoomConfig4.f28233c.f28359o = enterRoomConfig.f28233c.f28359o;
        enterRoomConfig4.f28233c.f28356l = enterRoomConfig.f28233c.f28356l;
        enterRoomConfig4.f28233c.f28357m = enterRoomConfig.f28233c.f28357m;
        enterRoomConfig4.f28233c.f28348d = enterRoomConfig.f28233c.f28348d;
        enterRoomConfig4.f28233c.f28284A = enterRoomConfig.f28233c.f28284A;
        enterRoomConfig4.f28233c.f28298O = enterRoomConfig.f28233c.f28298O;
        enterRoomConfig4.f28233c.f28299P = enterRoomConfig.f28233c.f28299P;
        enterRoomConfig4.f28233c.f28300Q = enterRoomConfig.f28233c.f28300Q;
        enterRoomConfig4.f28233c.f28304U = enterRoomConfig.f28233c.f28304U;
        enterRoomConfig4.f28233c.f28322ac = enterRoomConfig.f28233c.f28322ac;
        enterRoomConfig4.f28233c.f28306W = enterRoomConfig.f28233c.f28306W;
        enterRoomConfig4.f28233c.f28309Z = enterRoomConfig.f28233c.f28309Z;
        enterRoomConfig4.f28233c.f28302S = enterRoomConfig.f28233c.f28302S;
        enterRoomConfig4.f28233c.f28369y = enterRoomConfig.f28233c.f28369y;
        enterRoomConfig4.f28233c.f28323ad = enterRoomConfig.f28233c.f28323ad;
        enterRoomConfig4.f28233c.f28370z = enterRoomConfig.f28233c.f28370z;
        enterRoomConfig4.f28233c.f28344ay = enterRoomConfig.f28233c.f28344ay;
        enterRoomConfig4.f28233c.f28291H = enterRoomConfig.f28233c.f28291H;
        enterRoomConfig4.f28233c.f28305V = enterRoomConfig.f28233c.f28305V;
        enterRoomConfig4.f28233c.f28292I = enterRoomConfig.f28233c.f28292I;
        enterRoomConfig4.f28233c.f28326ag = enterRoomConfig.f28233c.f28326ag;
        enterRoomConfig4.f28233c.f28327ah = enterRoomConfig.f28233c.f28327ah;
        enterRoomConfig4.f28233c.f28331al = enterRoomConfig.f28233c.f28331al;
        enterRoomConfig4.f28233c.f28330ak = enterRoomConfig.f28233c.f28330ak;
        enterRoomConfig4.f28233c.f28329aj = enterRoomConfig.f28233c.f28329aj;
        enterRoomConfig4.f28233c.f28333an = enterRoomConfig.f28233c.f28333an;
        enterRoomConfig4.f28233c.f28334ao = enterRoomConfig.f28233c.f28334ao;
        EnterRoomConfig.GuestUser guestUser = enterRoomConfig4.f28233c.f28340au;
        if (guestUser != null) {
            EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.f28233c.f28340au;
            if (guestUser2 != null) {
                j = guestUser2.f28239a;
            } else {
                j = 0;
            }
            guestUser.f28239a = j;
        }
        EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig4.f28233c.f28340au;
        if (guestUser3 != null) {
            EnterRoomConfig.GuestUser guestUser4 = enterRoomConfig.f28233c.f28340au;
            if (guestUser4 != null) {
                str3 = guestUser4.f28240b;
            } else {
                str3 = null;
            }
            guestUser3.f28240b = str3;
        }
        EnterRoomConfig.GuestUser guestUser5 = enterRoomConfig4.f28233c.f28340au;
        boolean z = false;
        if (guestUser5 != null) {
            EnterRoomConfig.GuestUser guestUser6 = enterRoomConfig.f28233c.f28340au;
            if (guestUser6 != null) {
                i = guestUser6.f28241c;
            } else {
                i = 0;
            }
            guestUser5.f28241c = i;
        }
        EnterRoomConfig.GuestUser guestUser7 = enterRoomConfig4.f28233c.f28340au;
        if (guestUser7 != null) {
            EnterRoomConfig.GuestUser guestUser8 = enterRoomConfig.f28233c.f28340au;
            if (guestUser8 != null) {
                str2 = guestUser8.f28242d;
            } else {
                str2 = null;
            }
            guestUser7.f28242d = str2;
        }
        enterRoomConfig4.f28231a.f28375b = enterRoomConfig.f28231a.f28375b;
        enterRoomConfig4.f28231a.f28376c = enterRoomConfig.f28231a.f28376c;
        enterRoomConfig4.f28231a.f28377d = enterRoomConfig.f28231a.f28377d;
        enterRoomConfig4.f28231a.f28379f = enterRoomConfig.f28231a.f28379f;
        enterRoomConfig4.f28231a.f28380g = enterRoomConfig.f28231a.f28380g;
        enterRoomConfig4.f28231a.f28381h = enterRoomConfig.f28231a.f28381h;
        enterRoomConfig4.f28231a.f28382i = enterRoomConfig.f28231a.f28382i;
        enterRoomConfig4.f28231a.f28383j = enterRoomConfig.f28231a.f28383j;
        enterRoomConfig4.f28231a.f28384k = enterRoomConfig.f28231a.f28384k;
        enterRoomConfig4.f28231a.f28385l = enterRoomConfig.f28231a.f28385l;
        enterRoomConfig4.f28231a.f28386m = enterRoomConfig.f28231a.f28386m;
        enterRoomConfig4.f28232b.f28258b = enterRoomConfig.f28232b.f28258b;
        enterRoomConfig4.f28232b.f28257a = enterRoomConfig.f28232b.f28257a;
        enterRoomConfig4.f28232b.f28263g = enterRoomConfig.f28232b.f28263g;
        enterRoomConfig4.f28232b.f28267k = enterRoomConfig.f28232b.f28267k;
        EnterRoomConfig a = m15226a(enterRoomConfig3, stackContext);
        if (enterRoomConfig2 != null) {
            str = C7353a.m15257a(enterRoomConfig2);
        } else {
            str = null;
        }
        if (C89070n.m154556a((Iterable) ((List) C7354b.f18230b.getValue()), (Object) str)) {
            m15227d().clear();
            m15227d().push(a);
        } else {
            if (enterRoomConfig2 != null) {
                str4 = C7353a.m15257a(enterRoomConfig2);
            }
            if (C7354b.m15259b().contains("jump_source_all") || C89070n.m154556a((Iterable) C7354b.m15259b(), (Object) str4)) {
                m15227d().push(a);
            }
        }
        StringBuilder append = new StringBuilder("pushToStack: ").append(a).append(", success: ");
        if ((!m15227d().isEmpty()) && C89219l.m154714a(m15227d().peek(), a)) {
            z = true;
        }
        C3854a.m9453a(4, "LiveBackRoomStack", append.append(z).toString());
    }
}
