package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3086b.C53713a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53700k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager */
public final class ChatRoomLiveStateManager implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final C54472a f124777b = new C54472a((byte) 0);

    /* renamed from: a */
    public final AbstractC89244h f124778a = C89250i.m154773a((AbstractC89171a) C54475d.f124798a);

    /* renamed from: c */
    private int f124779c = -1;

    /* renamed from: d */
    private int f124780d = -1;

    /* renamed from: e */
    private boolean f124781e;

    /* renamed from: f */
    private final AbstractC89244h f124782f = C89250i.m154773a((AbstractC89171a) C54478g.f124801a);

    /* renamed from: g */
    private final AbstractC89244h f124783g = C89250i.m154773a((AbstractC89171a) C54476e.f124799a);

    /* renamed from: h */
    private final AbstractC89244h f124784h = C89250i.m154773a((AbstractC89171a) C54480i.f124803a);

    /* renamed from: i */
    private final AbstractC89244h f124785i = C89250i.m154773a((AbstractC89171a) C54479h.f124802a);

    /* renamed from: j */
    private final AbstractC89244h f124786j = C89250i.m154773a((AbstractC89171a) C54477f.f124800a);

    /* renamed from: k */
    private final RecyclerView f124787k;

    static {
        Covode.recordClassIndex(64180);
    }

    /* renamed from: f */
    private final Queue<Integer> m99808f() {
        return (Queue) this.f124782f.getValue();
    }

    /* renamed from: g */
    private final C88411a m99809g() {
        return (C88411a) this.f124783g.getValue();
    }

    /* renamed from: a */
    public final HashMap<String, NewLiveRoomStruct> mo91553a() {
        return (HashMap) this.f124784h.getValue();
    }

    /* renamed from: b */
    public final HashMap<String, Boolean> mo91555b() {
        return (HashMap) this.f124785i.getValue();
    }

    /* renamed from: c */
    public final List<AbstractC54560p> mo91556c() {
        return (List) this.f124786j.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(290, new RunnableC90250g(ChatRoomLiveStateManager.class, "onLiveStatusEvent", C53713a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$a */
    public static final class C54472a {
        static {
            Covode.recordClassIndex(64183);
        }

        private C54472a() {
        }

        public /* synthetic */ C54472a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$d */
    static final class C54475d extends AbstractC89220m implements AbstractC89171a<Set<Long>> {

        /* renamed from: a */
        public static final C54475d f124798a = new C54475d();

        static {
            Covode.recordClassIndex(64186);
        }

        C54475d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<Long> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$e */
    static final class C54476e extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C54476e f124799a = new C54476e();

        static {
            Covode.recordClassIndex(64187);
        }

        C54476e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$f */
    static final class C54477f extends AbstractC89220m implements AbstractC89171a<List<AbstractC54560p>> {

        /* renamed from: a */
        public static final C54477f f124800a = new C54477f();

        static {
            Covode.recordClassIndex(64188);
        }

        C54477f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<AbstractC54560p> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$g */
    static final class C54478g extends AbstractC89220m implements AbstractC89171a<ArrayDeque<Integer>> {

        /* renamed from: a */
        public static final C54478g f124801a = new C54478g();

        static {
            Covode.recordClassIndex(64189);
        }

        C54478g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayDeque<Integer> invoke() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$h */
    static final class C54479h extends AbstractC89220m implements AbstractC89171a<HashMap<String, Boolean>> {

        /* renamed from: a */
        public static final C54479h f124802a = new C54479h();

        static {
            Covode.recordClassIndex(64190);
        }

        C54479h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, Boolean> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$i */
    static final class C54480i extends AbstractC89220m implements AbstractC89171a<HashMap<String, NewLiveRoomStruct>> {

        /* renamed from: a */
        public static final C54480i f124803a = new C54480i();

        static {
            Covode.recordClassIndex(64191);
        }

        C54480i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, NewLiveRoomStruct> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$j */
    public static final class RunnableC54481j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatRoomLiveStateManager f124804a;

        static {
            Covode.recordClassIndex(64192);
        }

        public RunnableC54481j(ChatRoomLiveStateManager chatRoomLiveStateManager) {
            this.f124804a = chatRoomLiveStateManager;
        }

        public final void run() {
            this.f124804a.mo91557d();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.m156962a().mo145395b(this);
        m99808f().clear();
        mo91556c().clear();
        mo91553a().clear();
        m99809g().mo142944a();
    }

    /* renamed from: d */
    public final void mo91557d() {
        RecyclerView.AbstractC1362i layoutManager;
        if ((ActivityStack.getTopActivity() instanceof ChatRoomActivity) && (layoutManager = this.f124787k.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int k = linearLayoutManager.mo4371k();
            int m = linearLayoutManager.mo4373m();
            if (k >= 0) {
                if (k != this.f124779c || m != this.f124780d) {
                    this.f124779c = k;
                    this.f124780d = m;
                    m99808f().clear();
                    if (k <= m) {
                        while (true) {
                            m99808f().add(Integer.valueOf(k));
                            if (k == m) {
                                break;
                            }
                            k++;
                        }
                    }
                    if (!this.f124781e) {
                        this.f124781e = true;
                        mo91558e();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo91558e() {
        AbstractC58593c d;
        while (!m99808f().isEmpty()) {
            Integer poll = m99808f().poll();
            RecyclerView recyclerView = this.f124787k;
            C89219l.m154716b(poll, "");
            RecyclerView.ViewHolder f = recyclerView.mo4451f(poll.intValue());
            if (f instanceof AbstractC54560p) {
                AbstractC54560p pVar = (AbstractC54560p) f;
                String b = pVar.mo91593b();
                String c = pVar.mo91594c();
                if (b != null && b.length() > 0 && !mo91553a().containsKey(b) && (!C89219l.m154714a((Object) mo91555b().get(b), (Object) true))) {
                    C89233z.C89237d dVar = new C89233z.C89237d();
                    dVar.element = 0;
                    try {
                        dVar.element = Long.parseLong(b);
                    } catch (Exception unused) {
                    }
                    ILiveOuterService s = LiveOuterService.m107269s();
                    if (s != null && (d = s.mo95830d()) != null) {
                        mo91555b().put(b, true);
                        m99809g().mo142945a(d.mo95859a(dVar.element, c).mo143254a(new C54473b(this, b, dVar, c), new C54474c(this, b, dVar, c)));
                        return;
                    }
                    return;
                }
            }
        }
        this.f124781e = false;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onLiveStatusEvent(C53713a aVar) {
        C89219l.m154721d(aVar, "");
        mo91553a().put(aVar.f123243a, aVar.f123244b);
        mo91554a(aVar.f123243a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$b */
    public static final class C54473b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ChatRoomLiveStateManager f124790a;

        /* renamed from: b */
        final /* synthetic */ String f124791b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89237d f124792c;

        /* renamed from: d */
        final /* synthetic */ String f124793d;

        static {
            Covode.recordClassIndex(64184);
        }

        C54473b(ChatRoomLiveStateManager chatRoomLiveStateManager, String str, C89233z.C89237d dVar, String str2) {
            this.f124790a = chatRoomLiveStateManager;
            this.f124791b = str;
            this.f124792c = dVar;
            this.f124793d = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f124790a.mo91553a().put(this.f124791b, obj);
            this.f124790a.mo91555b().put(this.f124791b, false);
            this.f124790a.mo91554a(this.f124791b);
            this.f124790a.mo91558e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager$c */
    public static final class C54474c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ChatRoomLiveStateManager f124794a;

        /* renamed from: b */
        final /* synthetic */ String f124795b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89237d f124796c;

        /* renamed from: d */
        final /* synthetic */ String f124797d;

        static {
            Covode.recordClassIndex(64185);
        }

        C54474c(ChatRoomLiveStateManager chatRoomLiveStateManager, String str, C89233z.C89237d dVar, String str2) {
            this.f124794a = chatRoomLiveStateManager;
            this.f124795b = str;
            this.f124796c = dVar;
            this.f124797d = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof C34480a) {
                this.f124794a.mo91553a().put(this.f124795b, null);
            }
            this.f124794a.mo91555b().put(this.f124795b, false);
            this.f124794a.mo91554a(this.f124795b);
            this.f124794a.mo91558e();
        }
    }

    /* renamed from: a */
    public final void mo91554a(String str) {
        for (T t : mo91556c()) {
            if (TextUtils.equals(str, t.mo91593b())) {
                t.mo91595d();
            }
        }
    }

    public ChatRoomLiveStateManager(RecyclerView recyclerView, AbstractC1204m mVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(mVar, "");
        this.f124787k = recyclerView;
        EventBus.m156966a(EventBus.m156962a(), this);
        mVar.getLifecycle().mo4012a(this);
        recyclerView.mo4405a(new RecyclerView.AbstractC1371n(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.ChatRoomLiveStateManager.C544701 */

            /* renamed from: a */
            final /* synthetic */ ChatRoomLiveStateManager f124788a;

            static {
                Covode.recordClassIndex(64181);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f124788a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                C89219l.m154721d(recyclerView, "");
                super.mo4753a(recyclerView, i);
                if (i == 0) {
                    this.f124788a.mo91557d();
                }
            }
        });
        C53700k.m98970a(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.ChatRoomLiveStateManager.RunnableC544712 */

            /* renamed from: a */
            final /* synthetic */ ChatRoomLiveStateManager f124789a;

            static {
                Covode.recordClassIndex(64182);
            }

            {
                this.f124789a = r1;
            }

            public final void run() {
                this.f124789a.mo91557d();
            }
        }, 800);
    }
}
