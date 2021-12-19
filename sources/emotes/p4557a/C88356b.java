package emotes.p4557a;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p499ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4558b.C88367b;
import emotes.p4559c.C88379h;
import java.util.ArrayList;
import java.util.List;
import p4550e.p4553c.AbstractC88336a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89397d;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: emotes.a.b */
public final class C88356b extends ConstraintLayout implements AbstractC88336a, AbstractC88363c, AbstractC88364d {

    /* renamed from: t */
    public static final C88357a f200575t = new C88357a((byte) 0);

    /* renamed from: g */
    public RecyclerView f200576g;

    /* renamed from: h */
    public final C89399f f200577h = new C89399f();

    /* renamed from: i */
    public SSGridLayoutManager f200578i;

    /* renamed from: j */
    public AbstractC88358b f200579j;

    /* renamed from: k */
    public boolean f200580k;

    /* renamed from: l */
    public int f200581l = 5;

    /* renamed from: m */
    public boolean f200582m;

    /* renamed from: n */
    public boolean f200583n;

    /* renamed from: o */
    public boolean f200584o;

    /* renamed from: p */
    public final C89397d f200585p = new C89397d();

    /* renamed from: q */
    public final ArrayList<EmoteModel> f200586q = new ArrayList<>();

    /* renamed from: r */
    public C88411a f200587r = new C88411a();

    /* renamed from: s */
    public int f200588s = C3966y.m9653a(58.0f);

    /* renamed from: u */
    private final C88367b f200589u = new C88367b();

    /* renamed from: v */
    private AbstractC4141a f200590v;

    /* renamed from: w */
    private boolean f200591w;

    /* renamed from: emotes.a.b$b */
    public interface AbstractC88358b {
        static {
            Covode.recordClassIndex(104397);
        }

        /* renamed from: a */
        void mo7243a();

        /* renamed from: a */
        void mo7244a(boolean z);
    }

    static {
        Covode.recordClassIndex(104395);
    }

    /* renamed from: emotes.a.b$a */
    public static final class C88357a {
        static {
            Covode.recordClassIndex(104396);
        }

        private C88357a() {
        }

        public /* synthetic */ C88357a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo9139b() {
        if (this.f200582m || this.f200584o) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f200587r.mo142944a();
    }

    /* renamed from: c */
    public final void mo142866c() {
        boolean z;
        if (!this.f200586q.isEmpty()) {
            this.f200585p.clear();
            C89397d dVar = this.f200585p;
            if (!this.f200582m && !this.f200584o) {
                dVar.add(0, new C88379h(this.f200583n, this.f200582m));
            }
            for (T t : this.f200586q) {
                if (this.f200582m || this.f200584o) {
                    z = false;
                } else {
                    z = true;
                }
                t.f8731k = z;
                t.f8732l = this.f200591w;
            }
            dVar.addAll(this.f200586q);
            this.f200577h.notifyDataSetChanged();
        }
    }

    public final void setOnEmojiSelectListener(AbstractC4141a aVar) {
        this.f200590v = aVar;
    }

    /* renamed from: emotes.a.b$c */
    public static final class C88359c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C88356b f200592a;

        static {
            Covode.recordClassIndex(104398);
        }

        public C88359c(C88356b bVar) {
            this.f200592a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f200592a.onEvent((C11625a) obj);
        }
    }

    /* renamed from: emotes.a.b$f */
    public static final class C88362f extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C88356b f200595e;

        static {
            Covode.recordClassIndex(104401);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C88362f(C88356b bVar) {
            this.f200595e = bVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f200595e.f200577h.getItemViewType(i) == 0) {
                return this.f200595e.f200581l;
            }
            return 1;
        }
    }

    public final void setEmoteSelectPanelCallback(AbstractC88358b bVar) {
        C89219l.m154721d(bVar, "");
        this.f200579j = bVar;
    }

    @Override // p4550e.p4553c.AbstractC88336a
    /* renamed from: a */
    public final void mo142854a(C2972a aVar) {
        AbstractC4141a aVar2;
        if (aVar != null && (aVar2 = this.f200590v) != null) {
            aVar2.mo7240a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo142864a(boolean z) {
        if (this.f200591w != z) {
            this.f200591w = z;
            mo142866c();
        }
    }

    public final void onEvent(C11625a aVar) {
        C11688a aVar2;
        if (aVar != null && (aVar2 = aVar.f27775a) != null) {
            this.f200583n = aVar2.mo18452b();
            mo142866c();
        }
    }

    /* renamed from: emotes.a.b$d */
    public static final class C88360d extends AbstractC89220m implements AbstractC89172b<SubscribeBadge, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C88356b f200593a;

        static {
            Covode.recordClassIndex(104399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88360d(C88356b bVar) {
            super(1);
            this.f200593a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(SubscribeBadge subscribeBadge) {
            C89219l.m154721d(subscribeBadge, "");
            this.f200593a.f200582m = true;
            AbstractC88358b bVar = this.f200593a.f200579j;
            if (bVar != null) {
                bVar.mo7244a(this.f200593a.mo9139b());
            }
            this.f200593a.mo142866c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: emotes.a.b$e */
    public static final class C88361e extends AbstractC89220m implements AbstractC89172b<List<EmoteModel>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C88356b f200594a;

        static {
            Covode.recordClassIndex(104400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88361e(C88356b bVar) {
            super(1);
            this.f200594a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<EmoteModel> list) {
            List<EmoteModel> list2 = list;
            C89219l.m154721d(list2, "");
            if (list2.size() > 0 && this.f200594a.f200586q.size() == 0) {
                this.f200594a.f200586q.addAll(list2);
                this.f200594a.mo142866c();
            }
            return C89391z.f203057a;
        }
    }

    @Override // emotes.p4557a.AbstractC88364d
    /* renamed from: a */
    public final void mo142861a(String str) {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            AbstractC88358b bVar = this.f200579j;
            if (bVar != null) {
                bVar.mo7243a();
            }
            Context context = getContext();
            C89219l.m154716b(context, "");
            ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeEntry(context, room, str);
        }
    }

    public C88356b(Context context) {
        super(context);
        MethodCollector.m26663i(9060);
        LayoutInflater.from(context).inflate(R.layout.bdt, this);
        MethodCollector.m26664o(9060);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r9 != 3) goto L_0x003e;
     */
    @Override // emotes.p4557a.AbstractC88363c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo142865a(android.view.View r12, android.view.MotionEvent r13, int r14, com.bytedance.android.live.base.model.emoji.EmoteModel r15) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: emotes.p4557a.C88356b.mo142865a(android.view.View, android.view.MotionEvent, int, com.bytedance.android.live.base.model.emoji.EmoteModel):boolean");
    }
}
