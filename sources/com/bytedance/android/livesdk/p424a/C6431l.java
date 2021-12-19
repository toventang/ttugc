package com.bytedance.android.livesdk.p424a;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.adminsetting.AbstractC2915b;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordView;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p254k.AbstractC4372a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p561j.C9091dc;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.l */
public final class C6431l extends AbstractC11293v {

    /* renamed from: a */
    public boolean f16032a;

    /* renamed from: b */
    final AbstractC89244h f16033b = C11831d.m20835a(C6446l.f16057a);

    /* renamed from: c */
    final AbstractC89244h f16034c = C11831d.m20835a(C6438f.f16050a);

    /* renamed from: d */
    final AbstractC89244h f16035d = C11831d.m20835a(C6432a.f16043a);

    /* renamed from: e */
    final AbstractC89244h f16036e = C11831d.m20835a(C6445k.f16056a);

    /* renamed from: f */
    final AbstractC89244h f16037f = C11831d.m20835a(new C6439g(this));

    /* renamed from: g */
    private final AbstractC89244h f16038g = C11831d.m20835a(C6434c.f16045a);

    /* renamed from: h */
    private final AbstractC89244h f16039h = C11831d.m20835a(C6435d.f16046a);

    /* renamed from: i */
    private final AbstractC89244h f16040i = C11831d.m20835a(C6433b.f16044a);

    /* renamed from: j */
    private final View$OnLayoutChangeListenerC6436e f16041j = new View$OnLayoutChangeListenerC6436e(this);

    /* renamed from: k */
    private HashMap f16042k;

    static {
        Covode.recordClassIndex(7167);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f16042k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f16042k == null) {
            this.f16042k = new HashMap();
        }
        View view = (View) this.f16042k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16042k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final View$OnClickListenerC6448n mo9929d() {
        return (View$OnClickListenerC6448n) this.f16038g.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C6463p mo12587e() {
        return (C6463p) this.f16039h.getValue();
    }

    /* renamed from: f */
    public final C6450o mo12588f() {
        return (C6450o) this.f16040i.getValue();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$b */
    static final class C6433b extends AbstractC89220m implements AbstractC89171a<C6450o> {

        /* renamed from: a */
        public static final C6433b f16044a = new C6433b();

        static {
            Covode.recordClassIndex(7169);
        }

        C6433b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6450o invoke() {
            return new C6450o();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$c */
    static final class C6434c extends AbstractC89220m implements AbstractC89171a<View$OnClickListenerC6448n> {

        /* renamed from: a */
        public static final C6434c f16045a = new C6434c();

        static {
            Covode.recordClassIndex(7170);
        }

        C6434c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnClickListenerC6448n invoke() {
            return new View$OnClickListenerC6448n();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$d */
    static final class C6435d extends AbstractC89220m implements AbstractC89171a<C6463p> {

        /* renamed from: a */
        public static final C6435d f16046a = new C6435d();

        static {
            Covode.recordClassIndex(7171);
        }

        C6435d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6463p invoke() {
            return new C6463p();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$k */
    static final class C6445k extends AbstractC89220m implements AbstractC89171a<C6476r> {

        /* renamed from: a */
        public static final C6445k f16056a = new C6445k();

        static {
            Covode.recordClassIndex(7181);
        }

        C6445k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6476r invoke() {
            return new C6476r();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$l */
    static final class C6446l extends AbstractC89220m implements AbstractC89171a<C6481s> {

        /* renamed from: a */
        public static final C6446l f16057a = new C6446l();

        static {
            Covode.recordClassIndex(7182);
        }

        C6446l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6481s invoke() {
            return new C6481s();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$e */
    public static final class View$OnLayoutChangeListenerC6436e implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ C6431l f16047a;

        /* renamed from: b */
        private final AbstractC89244h f16048b = C89250i.m154773a((AbstractC89171a) C6437a.f16049a);

        static {
            Covode.recordClassIndex(7172);
        }

        /* renamed from: a */
        private final float m13843a() {
            return ((Number) this.f16048b.getValue()).floatValue();
        }

        /* renamed from: com.bytedance.android.livesdk.a.l$e$a */
        static final class C6437a extends AbstractC89220m implements AbstractC89171a<Float> {

            /* renamed from: a */
            public static final C6437a f16049a = new C6437a();

            static {
                Covode.recordClassIndex(7173);
            }

            C6437a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(((float) C3966y.m9662b()) * 0.75f);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnLayoutChangeListenerC6436e(C6431l lVar) {
            this.f16047a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
            if (r4.mo12595a() != false) goto L_0x0077;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLayoutChange(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
            /*
            // Method dump skipped, instructions count: 187
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p424a.C6431l.View$OnLayoutChangeListenerC6436e.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$a */
    static final class C6432a extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C6432a f16043a = new C6432a();

        static {
            Covode.recordClassIndex(7168);
        }

        C6432a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return ((AbstractC4372a) C6193a.m13435a(AbstractC4372a.class)).getAddModeratorFragment();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$f */
    static final class C6438f extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C6438f f16050a = new C6438f();

        static {
            Covode.recordClassIndex(7174);
        }

        C6438f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return ((AbstractC4372a) C6193a.m13435a(AbstractC4372a.class)).getModeratorListFragment();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$g */
    static final class C6439g extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ C6431l f16051a;

        static {
            Covode.recordClassIndex(7175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6439g(C6431l lVar) {
            super(0);
            this.f16051a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return ((AbstractC2915b) C6193a.m13435a(AbstractC2915b.class)).getMuteDurationSettingFragment(new View.OnClickListener(this) {
                /* class com.bytedance.android.livesdk.p424a.C6431l.C6439g.View$OnClickListenerC64401 */

                /* renamed from: a */
                final /* synthetic */ C6439g f16052a;

                static {
                    Covode.recordClassIndex(7176);
                }

                {
                    this.f16052a = r1;
                }

                public final void onClick(View view) {
                    DataChannel dataChannel = this.f16052a.f16051a.f27010p;
                    if (dataChannel != null) {
                        dataChannel.mo28315b(C9136r.class, C9137s.m17356a(EnumC9135q.COMMENT_SETTING));
                    }
                }
            }, new AbstractC89172b<C3265j, C89391z>(this) {
                /* class com.bytedance.android.livesdk.p424a.C6431l.C6439g.C64412 */

                /* renamed from: a */
                final /* synthetic */ C6439g f16053a;

                static {
                    Covode.recordClassIndex(7177);
                }

                {
                    this.f16053a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C3265j jVar) {
                    Room room;
                    boolean z;
                    String str;
                    long j;
                    Boolean bool;
                    C3265j jVar2 = jVar;
                    C89219l.m154721d(jVar2, "");
                    DataChannel dataChannel = this.f16053a.f16051a.f27010p;
                    if (dataChannel != null) {
                        room = (Room) dataChannel.mo28318b(C9093de.class);
                    } else {
                        room = null;
                    }
                    DataChannel dataChannel2 = this.f16053a.f16051a.f27010p;
                    if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null) {
                        z = false;
                    } else {
                        z = bool.booleanValue();
                    }
                    AbstractC2915b bVar = (AbstractC2915b) C6193a.m13435a(AbstractC2915b.class);
                    if (z) {
                        str = "anchor";
                    } else {
                        str = "admin";
                    }
                    long j2 = 0;
                    if (room != null) {
                        j = room.getOwnerUserId();
                        j2 = room.getId();
                    } else {
                        j = 0;
                    }
                    bVar.reportDefaultMuteDurationChange(str, jVar2, "live_take_detail", j, Long.valueOf(j2));
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b6h);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.a2c;
        bVar.f27022i = -1;
        bVar.f27025l = 18;
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void dismiss() {
        if (this.f16032a) {
            C6450o f = mo12588f();
            if (f.isViewValid()) {
                ((BlockWordView) f.mo12593a(R.id.tb)).mo8250a();
            }
        }
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            a.mo28319c(C9091dc.class);
        }
        super.dismiss();
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$i */
    static final class View$OnClickListenerC6443i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6431l f16055a;

        static {
            Covode.recordClassIndex(7179);
        }

        View$OnClickListenerC6443i(C6431l lVar) {
            this.f16055a = lVar;
        }

        public final void onClick(View view) {
            this.f16055a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$h */
    static final class C6442h extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6431l f16054a;

        static {
            Covode.recordClassIndex(7178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6442h(C6431l lVar) {
            super(1);
            this.f16054a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f16054a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo12586a(Dialog dialog) {
        View decorView;
        C89219l.m154721d(dialog, "");
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.addOnLayoutChangeListener(this.f16041j);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C3018a.class, (AbstractC89172b) new C6442h(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$j */
    static final /* synthetic */ class C6444j extends C89217j implements AbstractC89172b<EnumC9135q, C89391z> {
        static {
            Covode.recordClassIndex(7180);
        }

        C6444j(C6431l lVar) {
            super(1, lVar, C6431l.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0057 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [androidx.fragment.app.Fragment] */
        /* JADX WARN: Type inference failed for: r3v8, types: [com.bytedance.android.livesdk.a.s] */
        /* JADX WARN: Type inference failed for: r3v10, types: [com.bytedance.android.livesdk.a.r] */
        /* JADX WARN: Type inference failed for: r3v12, types: [androidx.fragment.app.Fragment] */
        /* JADX WARN: Type inference failed for: r3v14, types: [androidx.fragment.app.Fragment] */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
            if (r3 == null) goto L_0x0016;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
        /* JADX WARNING: Unknown variable types count: 5 */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.android.livesdk.p561j.EnumC9135q r5) {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p424a.C6431l.C6444j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo8166a_(R.id.dwv).setOnClickListener(new View$OnClickListenerC6443i(this));
        getChildFragmentManager().mo3552a().mo3453a(R.id.hc, mo9929d()).mo3467b();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C9136r.class, (AbstractC89172b) new C6444j(this));
        }
    }
}
