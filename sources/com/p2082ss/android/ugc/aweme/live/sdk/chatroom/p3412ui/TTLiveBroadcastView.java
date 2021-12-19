package com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.p697j.AbstractC11821a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.live.Live;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.livehostimpl.C58676ak;
import com.p2082ss.android.ugc.aweme.live.model.C58721a;
import com.p2082ss.android.ugc.aweme.live.p3409f.C58612a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g;
import com.p2082ss.android.ugc.aweme.services.IAVFilterService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74315h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74319k;
import com.p2082ss.android.ugc.aweme.story.live.C77351a;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView */
public final class TTLiveBroadcastView implements AbstractC33974au, AbstractC58753a, AbstractC90252i, AbstractC90253j {

    /* renamed from: s */
    public static final C58732a f133663s = new C58732a((byte) 0);

    /* renamed from: A */
    private float f133664A;

    /* renamed from: B */
    private float f133665B;

    /* renamed from: C */
    private float f133666C;

    /* renamed from: D */
    private final C58737f f133667D = new C58737f(this);

    /* renamed from: a */
    public final IRecordingOperationPanel f133668a;

    /* renamed from: b */
    public FrameLayout f133669b;

    /* renamed from: c */
    public AbstractC11685f f133670c;

    /* renamed from: d */
    public float f133671d;

    /* renamed from: e */
    public float f133672e;

    /* renamed from: f */
    public float f133673f;

    /* renamed from: g */
    public List<String> f133674g;

    /* renamed from: h */
    public List<String> f133675h;

    /* renamed from: i */
    public String f133676i;

    /* renamed from: j */
    public String f133677j;

    /* renamed from: k */
    public AbstractC74319k f133678k;

    /* renamed from: l */
    public int f133679l = -1;

    /* renamed from: m */
    public boolean f133680m;

    /* renamed from: n */
    public boolean f133681n;

    /* renamed from: o */
    public boolean f133682o = true;

    /* renamed from: p */
    public boolean f133683p;

    /* renamed from: q */
    public final List<FilterBean> f133684q = new ArrayList();

    /* renamed from: r */
    public AbstractC11683e.AbstractC11684a f133685r;

    /* renamed from: t */
    private SimpleDraweeView f133686t;

    /* renamed from: u */
    private C58754b f133687u;

    /* renamed from: v */
    private AbstractC11685f f133688v;

    /* renamed from: w */
    private AbstractC74317i f133689w;

    /* renamed from: x */
    private int f133690x;

    /* renamed from: y */
    private float f133691y;

    /* renamed from: z */
    private float f133692z;

    static {
        Covode.recordClassIndex(69037);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(56, new RunnableC90250g(TTLiveBroadcastView.class, "onFilterChange", C58721a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(57, new RunnableC90250g(TTLiveBroadcastView.class, "onCameraReverse", C77351a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        this.f133683p = true;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$a */
    public static final class C58732a {
        static {
            Covode.recordClassIndex(69038);
        }

        private C58732a() {
        }

        public /* synthetic */ C58732a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui.AbstractC58753a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo96136a() {
        return this.f133669b;
    }

    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f */
    public static final class C58737f implements AbstractC11683e {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133697a;

        static {
            Covode.recordClassIndex(69043);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8854a(String str) {
            C89219l.m154721d(str, "");
            IRecordingOperationPanel iRecordingOperationPanel = this.f133697a.f133668a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.onHidePanel(str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8852a(C11672a aVar, String str) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(str, "");
            IRecordingOperationPanel iRecordingOperationPanel = this.f133697a.f133668a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.onStickerCancel(C58676ak.m107826a(aVar), str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8851a(AbstractC11683e.AbstractC11684a aVar) {
            C89219l.m154721d(aVar, "");
            this.f133697a.f133685r = aVar;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8853a(PrivacyCert privacyCert) {
            IRecordingOperationPanel iRecordingOperationPanel = this.f133697a.f133668a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.closeCamera(privacyCert);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f$b */
        static final class C58739b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C58737f f133699a;

            static {
                Covode.recordClassIndex(69045);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C58739b(C58737f fVar) {
                super(0);
                this.f133699a = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f133699a.f133697a.mo96138a(this.f133699a.f133697a.f133673f);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f$a */
        static final class C58738a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C58737f f133698a;

            static {
                Covode.recordClassIndex(69044);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C58738a(C58737f fVar) {
                super(0);
                this.f133698a = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                if (this.f133698a.f133697a.f133682o && this.f133698a.f133697a.f133678k != null) {
                    AbstractC74319k kVar = this.f133698a.f133697a.f133678k;
                    if (kVar != null) {
                        kVar.mo116924a(this.f133698a.f133697a.f133673f, 0.0f);
                    }
                    this.f133698a.f133697a.f133682o = false;
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8857b() {
            this.f133697a.f133681n = true;
            AbstractC11685f fVar = this.f133697a.f133670c;
            if (fVar != null && fVar.mo8727B().isEmpty()) {
                C1731i.m5631a(200).mo5534a(new C58742e(this), C1731i.f5564c, null);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8847a() {
            IRecordingOperationPanel iRecordingOperationPanel = this.f133697a.f133668a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.closeRecording();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58737f(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f133697a = tTLiveBroadcastView;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8849a(int i) {
            this.f133697a.mo96139a(i);
        }

        /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f$c */
        static final class C58740c<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C58737f f133700a;

            static {
                Covode.recordClassIndex(69046);
            }

            C58740c(C58737f fVar) {
                this.f133700a = fVar;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                C89219l.m154721d(iVar, "");
                this.f133700a.f133697a.mo96146d();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f$d */
        static final class C58741d<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C58737f f133701a;

            static {
                Covode.recordClassIndex(69047);
            }

            C58741d(C58737f fVar) {
                this.f133701a = fVar;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                C89219l.m154721d(iVar, "");
                this.f133701a.f133697a.mo96145c();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f$e */
        static final class C58742e<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C58737f f133702a;

            static {
                Covode.recordClassIndex(69048);
            }

            C58742e(C58737f fVar) {
                this.f133702a = fVar;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                C89219l.m154721d(iVar, "");
                this.f133702a.f133697a.mo96145c();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f$f */
        static final class C58743f<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C58737f f133703a;

            /* renamed from: b */
            final /* synthetic */ PrivacyCert f133704b;

            static {
                Covode.recordClassIndex(69049);
            }

            C58743f(C58737f fVar, PrivacyCert privacyCert) {
                this.f133703a = fVar;
                this.f133704b = privacyCert;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                C89219l.m154721d(iVar, "");
                this.f133703a.f133697a.mo96146d();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$f$g */
        static final class C58744g<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C58737f f133705a;

            /* renamed from: b */
            final /* synthetic */ PrivacyCert f133706b;

            static {
                Covode.recordClassIndex(69050);
            }

            C58744g(C58737f fVar, PrivacyCert privacyCert) {
                this.f133705a = fVar;
                this.f133706b = privacyCert;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                C89219l.m154721d(iVar, "");
                this.f133705a.f133697a.mo96145c();
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8845a(String[] strArr) {
            C89219l.m154721d(strArr, "");
            mo8846a(strArr, (String[]) null);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final int mo8855b(String[] strArr) {
            C89219l.m154721d(strArr, "");
            return mo8856b(strArr, (String[]) null);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: c */
        public final void mo8863c(float f) {
            this.f133697a.f133672e = f;
            TTLiveBroadcastView tTLiveBroadcastView = this.f133697a;
            tTLiveBroadcastView.mo96137a(tTLiveBroadcastView.f133671d, this.f133697a.f133672e);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8858b(float f) {
            this.f133697a.f133671d = f;
            TTLiveBroadcastView tTLiveBroadcastView = this.f133697a;
            tTLiveBroadcastView.mo96137a(tTLiveBroadcastView.f133671d, this.f133697a.f133672e);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: c */
        public final int mo8862c(String[] strArr) {
            AbstractC74319k kVar;
            if (!(strArr == null || strArr.length == 0 || (kVar = this.f133697a.f133678k) == null)) {
                C89219l.m154716b(strArr, "");
                kVar.mo116933a(C89064i.m154508i(strArr));
            }
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: d */
        public final void mo8864d(float f) {
            AbstractC74319k kVar;
            String str;
            IAVFilterService filterService;
            if (this.f133697a.f133680m && (kVar = this.f133697a.f133678k) != null) {
                IExternalService a = AVExternalServiceImpl.m113114a();
                if (a == null || (filterService = a.filterService()) == null || (str = filterService.getFilterFolder(this.f133697a.f133684q.get(this.f133697a.f133679l))) == null) {
                    str = "";
                }
                kVar.mo116940b(str, f);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8860b(PrivacyCert privacyCert) {
            IRecordingOperationPanel iRecordingOperationPanel = this.f133697a.f133668a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.openCamera(privacyCert);
                if (this.f133697a.f133680m && this.f133697a.f133681n) {
                    C1731i.m5631a(500).mo5534a(new C58743f(this, privacyCert), C1731i.f5564c, null);
                    C1731i.m5631a(500).mo5534a(new C58744g(this, privacyCert), C1731i.f5564c, null);
                }
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8848a(float f) {
            this.f133697a.f133673f = f;
            C6204h.m13474a(new C58738a(this));
            C6204h.m13474a(new C58739b(this));
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8861b(String str) {
            C89219l.m154721d(str, "");
            IRecordingOperationPanel iRecordingOperationPanel = this.f133697a.f133668a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.onShowPanel(str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8842a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            AbstractC74319k kVar = this.f133697a.f133678k;
            if (kVar == null) {
                return 0;
            }
            this.f133697a.f133676i = str;
            this.f133697a.f133677j = str2;
            return kVar.mo116937b(str, str2);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final int mo8856b(String[] strArr, String[] strArr2) {
            C89219l.m154721d(strArr, "");
            AbstractC74319k kVar = this.f133697a.f133678k;
            if (kVar != null) {
                kVar.mo116949f();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    if (strArr2 == null || i >= strArr2.length) {
                        arrayList.add(strArr[i]);
                        arrayList2.add("");
                    } else {
                        arrayList.add(strArr[i]);
                        arrayList2.add(strArr2[i]);
                    }
                }
                this.f133697a.f133674g = arrayList;
                this.f133697a.f133675h = arrayList2;
                this.f133697a.f133676i = null;
                this.f133697a.f133677j = null;
                kVar.mo116941b(arrayList, arrayList2);
            }
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8846a(String[] strArr, String[] strArr2) {
            C89219l.m154721d(strArr, "");
            AbstractC74319k kVar = this.f133697a.f133678k;
            if (kVar != null) {
                kVar.mo116949f();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    if (strArr2 == null || i >= strArr2.length) {
                        arrayList.add(strArr[i]);
                        arrayList2.add("");
                    } else {
                        arrayList.add(strArr[i]);
                        arrayList2.add(strArr2[i]);
                    }
                }
                this.f133697a.f133674g = arrayList;
                this.f133697a.f133675h = arrayList2;
                this.f133697a.f133676i = null;
                this.f133697a.f133677j = null;
                kVar.mo116934a(arrayList, arrayList2);
            }
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8859b(C11672a aVar, String str) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(str, "");
            IRecordingOperationPanel iRecordingOperationPanel = this.f133697a.f133668a;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.onStickerChosen(C58676ak.m107826a(aVar), str);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8850a(int i, PrivacyCert privacyCert) {
            IRecordingOperationPanel iRecordingOperationPanel = this.f133697a.f133668a;
            if (!(iRecordingOperationPanel == null || iRecordingOperationPanel.getCameraPos() == i)) {
                iRecordingOperationPanel.setCameraPos(i, privacyCert);
            }
            C1731i.m5631a(100).mo5534a(new C58740c(this), C1731i.f5564c, null);
            C1731i.m5631a(100).mo5534a(new C58741d(this), C1731i.f5564c, null);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8843a(String str, String str2, float f) {
            AbstractC74319k kVar;
            if (!C80538hl.m139614a(str) || !C80538hl.m139614a(str2) || (kVar = this.f133697a.f133678k) == null) {
                return 0;
            }
            kVar.mo116932a(str, str2, f);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8844a(String str, String str2, int[] iArr) {
            int[] iArr2;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(iArr, "");
            AbstractC74319k kVar = this.f133697a.f133678k;
            if (kVar != null) {
                iArr2 = kVar.mo116935a(str, str2);
            } else {
                iArr2 = null;
            }
            if (iArr2 == null || iArr2.length != 2) {
                iArr[0] = 0;
            } else {
                iArr[0] = iArr2[1];
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$i */
    public static final class C58747i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133709a;

        static {
            Covode.recordClassIndex(69053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58747i(TTLiveBroadcastView tTLiveBroadcastView) {
            super(0);
            this.f133709a = tTLiveBroadcastView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            TTLiveBroadcastView tTLiveBroadcastView = this.f133709a;
            tTLiveBroadcastView.mo96137a(tTLiveBroadcastView.f133671d, this.f133709a.f133672e);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$j */
    public static final class C58748j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133710a;

        static {
            Covode.recordClassIndex(69054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58748j(TTLiveBroadcastView tTLiveBroadcastView) {
            super(0);
            this.f133710a = tTLiveBroadcastView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            TTLiveBroadcastView tTLiveBroadcastView = this.f133710a;
            tTLiveBroadcastView.mo96138a(tTLiveBroadcastView.f133673f);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$k */
    public static final class C58749k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133711a;

        static {
            Covode.recordClassIndex(69055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58749k(TTLiveBroadcastView tTLiveBroadcastView) {
            super(0);
            this.f133711a = tTLiveBroadcastView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC74319k kVar = this.f133711a.f133678k;
            if (kVar != null) {
                kVar.mo116944c(0.0f, 0.0f);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$l */
    public static final class C58750l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133712a;

        static {
            Covode.recordClassIndex(69056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58750l(TTLiveBroadcastView tTLiveBroadcastView) {
            super(0);
            this.f133712a = tTLiveBroadcastView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f133712a.f133679l != -1) {
                TTLiveBroadcastView tTLiveBroadcastView = this.f133712a;
                tTLiveBroadcastView.mo96144b(tTLiveBroadcastView.f133679l);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final void mo96145c() {
        if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel() && this.f133678k != null) {
            this.f133683p = false;
            C6204h.m13474a(new C58747i(this));
            C6204h.m13474a(new C58748j(this));
            C6204h.m13474a(new C58749k(this));
        }
        C6204h.m13474a(new C58750l(this));
    }

    /* renamed from: d */
    public final void mo96146d() {
        String str;
        AbstractC74319k kVar;
        List<String> list;
        AbstractC74319k kVar2;
        List<String> list2 = this.f133674g;
        if (!(list2 == null || !(!list2.isEmpty()) || (list = this.f133675h) == null || (kVar2 = this.f133678k) == null)) {
            kVar2.mo116934a(this.f133674g, list);
        }
        String str2 = this.f133676i;
        if (str2 != null && (str = this.f133677j) != null && (kVar = this.f133678k) != null) {
            kVar.mo116937b(str2, str);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        int i;
        AbstractC11685f fVar = this.f133670c;
        if (fVar != null) {
            fVar.mo8736a((AbstractC11683e) null);
        }
        this.f133678k = null;
        EventBus.m156962a().mo145395b(this);
        IRecordingOperationPanel iRecordingOperationPanel = this.f133668a;
        if (iRecordingOperationPanel != null) {
            i = iRecordingOperationPanel.getCameraPos();
        } else {
            i = 1;
        }
        AVExternalServiceImpl.m113114a().configService().avsettingsConfig().setDefaultFilterForCamera(i, this.f133690x);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (this.f133680m && this.f133681n) {
            C1731i.m5631a(500).mo5534a(new C58745g(this), C1731i.f5564c, null);
            C1731i.m5631a(500).mo5534a(new C58746h(this), C1731i.f5564c, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui.AbstractC58753a
    /* renamed from: b */
    public final void mo96143b() {
        AbstractC74319k kVar;
        float f;
        if (this.f133680m) {
            this.f133680m = false;
            AbstractC11685f fVar = this.f133670c;
            if (fVar != null) {
                fVar.mo8730E();
            }
            C58754b bVar = this.f133687u;
            if (bVar != null) {
                bVar.f133715a = 2;
                bVar.mo96153a();
            }
            SimpleDraweeView simpleDraweeView = this.f133686t;
            if (simpleDraweeView != null) {
                simpleDraweeView.setVisibility(8);
            }
            AbstractC74317i iVar = this.f133689w;
            if (iVar != null) {
                iVar.mo113484a();
            }
            AbstractC74319k kVar2 = this.f133678k;
            if (kVar2 != null) {
                kVar2.mo116926a(this.f133690x);
            }
            if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel() && (kVar = this.f133678k) != null) {
                kVar.mo116939b(kVar.mo116942c(), kVar.mo116945d());
                float e = kVar.mo116947e();
                if (this.f133690x == 0) {
                    f = 0.35f;
                } else {
                    f = 0.0f;
                }
                kVar.mo116924a(e, f);
                kVar.mo116944c(kVar.mo116922a(), kVar.mo116936b());
            }
        }
    }

    /* renamed from: e */
    private final void m107915e() {
        AbstractC11685f fVar = this.f133670c;
        if (fVar != null) {
            List<Pair<String, String>> B = fVar.mo8727B();
            if (!B.isEmpty() && B.size() != this.f133684q.size()) {
                this.f133684q.clear();
                List<FilterBean> list = this.f133684q;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < B.size()) {
                    String str = (String) B.get(i).second;
                    FilterBean filterBean = new FilterBean();
                    i++;
                    filterBean.setId(i);
                    filterBean.setName((String) B.get(i).first);
                    filterBean.setFilterFilePath(C58612a.m107734a(str));
                    AVExternalServiceImpl.m113114a().filterService().setFilterFolder(filterBean, str);
                    filterBean.setThumbnailFilePath(str + "/thumbnail.jpg");
                    arrayList.add(filterBean);
                }
                C89219l.m154716b(arrayList, "");
                list.addAll(arrayList);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$b */
    public static final class C58733b implements AbstractC74315h {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133693a;

        static {
            Covode.recordClassIndex(69039);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58733b(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f133693a = tTLiveBroadcastView;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74315h
        /* renamed from: a */
        public final void mo96152a(int i) {
            AbstractC11683e.AbstractC11684a aVar;
            if (!this.f133693a.f133683p && (aVar = this.f133693a.f133685r) != null) {
                aVar.mo8788a(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$g */
    public static final class C58745g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133707a;

        static {
            Covode.recordClassIndex(69051);
        }

        C58745g(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f133707a = tTLiveBroadcastView;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            this.f133707a.mo96146d();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$h */
    public static final class C58746h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133708a;

        static {
            Covode.recordClassIndex(69052);
        }

        C58746h(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f133708a = tTLiveBroadcastView;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            this.f133708a.mo96145c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$m */
    static final class C58751m<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133713a;

        static {
            Covode.recordClassIndex(69057);
        }

        C58751m(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f133713a = tTLiveBroadcastView;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            this.f133713a.mo96146d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$n */
    static final class C58752n<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133714a;

        static {
            Covode.recordClassIndex(69058);
        }

        C58752n(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f133714a = tTLiveBroadcastView;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            this.f133714a.mo96145c();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui.AbstractC58753a
    /* renamed from: a */
    public final void mo96141a(AbstractC63279g.AbstractC63280a aVar) {
        C89219l.m154721d(aVar, "");
        C58754b bVar = this.f133687u;
        if (bVar != null) {
            bVar.f133719e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$c */
    static final class C58734c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ TTLiveBroadcastView f133694a;

        static {
            Covode.recordClassIndex(69040);
        }

        C58734c(TTLiveBroadcastView tTLiveBroadcastView) {
            this.f133694a = tTLiveBroadcastView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            AbstractC11685f fVar = this.f133694a.f133670c;
            if (fVar != null) {
                C89219l.m154716b(f, "");
                fVar.mo8734a(f.floatValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo96139a(int i) {
        if (!this.f133680m) {
            this.f133690x = i;
        } else if (this.f133681n && i != -1 && this.f133679l != i) {
            mo96144b(i);
        }
    }

    @AbstractC90264r
    public final void onCameraReverse(C77351a aVar) {
        AbstractC11685f fVar;
        boolean z;
        C89219l.m154721d(aVar, "");
        if (this.f133680m && this.f133681n && (fVar = this.f133670c) != null && fVar.mo8728C() != (z = aVar.f173549a)) {
            fVar.mo8735a(z ? 1 : 0);
        }
    }

    @AbstractC90264r
    public final void onFilterChange(C58721a aVar) {
        C89219l.m154721d(aVar, "");
        FilterBean filterBean = aVar.f133651a;
        int i = aVar.f133652b;
        if (filterBean != null) {
            int size = this.f133684q.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (C89219l.m154714a(filterBean, this.f133684q.get(i2))) {
                    i = i2;
                }
            }
        }
        mo96139a(i);
    }

    /* renamed from: a */
    public final void mo96138a(float f) {
        String str;
        float f2;
        String z;
        AbstractC74319k kVar = this.f133678k;
        if (kVar != null) {
            AbstractC11685f fVar = this.f133670c;
            if (fVar == null || (z = fVar.mo8769z()) == null || z.length() != 0) {
                AbstractC11685f fVar2 = this.f133670c;
                if (fVar2 != null) {
                    str = fVar2.mo8769z();
                } else {
                    str = null;
                }
                kVar.mo116930a(str, f);
            } else {
                kVar.mo116924a(f, 0.0f);
            }
            if (f > 0.0f) {
                f2 = 0.05f;
            } else {
                f2 = 0.01f;
            }
            kVar.mo116923a(f2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui.AbstractC58753a
    /* renamed from: a */
    public final void mo96142a(View... viewArr) {
        View[] viewArr2;
        C89219l.m154721d(viewArr, "");
        C58754b bVar = this.f133687u;
        if (!(bVar == null || (viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length)) == null)) {
            for (View view : viewArr2) {
                bVar.f133717c.add(view);
            }
        }
    }

    /* renamed from: b */
    public final void mo96144b(int i) {
        IAVFilterService filterService;
        String filterFolder;
        float f;
        IAVFilterService filterService2;
        String filterFolder2;
        this.f133679l = i;
        m107915e();
        AbstractC74317i iVar = this.f133689w;
        if (iVar != null) {
            iVar.mo113486a(this.f133684q, i);
        }
        AbstractC11685f fVar = this.f133670c;
        if (fVar != null) {
            fVar.mo8742b(this.f133679l);
        }
        if (this.f133684q.size() > this.f133679l) {
            String str = "";
            if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
                AbstractC74319k kVar = this.f133678k;
                if (kVar != null) {
                    IExternalService a = AVExternalServiceImpl.m113114a();
                    if (!(a == null || (filterService2 = a.filterService()) == null || (filterFolder2 = filterService2.getFilterFolder(this.f133684q.get(this.f133679l))) == null)) {
                        str = filterFolder2;
                    }
                    AbstractC11685f fVar2 = this.f133670c;
                    if (fVar2 != null) {
                        f = fVar2.mo8744c(this.f133679l);
                    } else {
                        f = 0.0f;
                    }
                    kVar.mo116940b(str, f);
                    return;
                }
                return;
            }
            AbstractC74319k kVar2 = this.f133678k;
            if (kVar2 != null) {
                IExternalService a2 = AVExternalServiceImpl.m113114a();
                if (!(a2 == null || (filterService = a2.filterService()) == null || (filterFolder = filterService.getFilterFolder(this.f133684q.get(this.f133679l))) == null)) {
                    str = filterFolder;
                }
                kVar2.mo116929a(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui.AbstractC58753a
    /* renamed from: a */
    public final void mo96140a(Bundle bundle) {
        boolean z;
        AbstractC74317i iVar;
        AbstractC74319k kVar;
        int i;
        SimpleDraweeView simpleDraweeView;
        LiveData<Float> zoomEvent;
        AbstractC0952i fragmentManager;
        AbstractC0976n b;
        C89219l.m154721d(bundle, "");
        if (!this.f133680m) {
            this.f133680m = true;
            try {
                String string = bundle.getString("sourceParams");
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    bundle.putString("request_from", jSONObject.optString("request_from"));
                    bundle.putString("hashtag_title", jSONObject.optString("hashtag_title"));
                    bundle.putLong("hashtag_id", jSONObject.optLong("hashtag_id"));
                }
            } catch (Exception unused) {
            }
            if (this.f133670c == null) {
                if (this.f133688v == null) {
                    this.f133688v = Live.getService().mo12980a(C58735d.f133695a);
                }
                AbstractC11685f fVar = this.f133688v;
                this.f133670c = fVar;
                if (fVar != null) {
                    fVar.mo8731F().setArguments(bundle);
                    fVar.mo8736a(this.f133667D);
                    C58757d dVar = new C58757d();
                    Fragment F = fVar.mo8731F();
                    C89219l.m154716b(F, "");
                    C89219l.m154721d(F, "");
                    dVar.f133723a = F;
                    IRecordingOperationPanel iRecordingOperationPanel = this.f133668a;
                    if (!(iRecordingOperationPanel == null || (fragmentManager = iRecordingOperationPanel.fragmentManager()) == null || (b = fragmentManager.mo3552a().mo3469b(R.id.c_z, dVar)) == null)) {
                        b.mo3478e();
                    }
                }
                IRecordingOperationPanel iRecordingOperationPanel2 = this.f133668a;
                if (iRecordingOperationPanel2 == null || (simpleDraweeView = iRecordingOperationPanel2.backgroundView()) == null) {
                    simpleDraweeView = null;
                } else {
                    simpleDraweeView.setVisibility(8);
                }
                this.f133686t = simpleDraweeView;
                m107915e();
                AbstractC11685f fVar2 = this.f133670c;
                if (fVar2 != null) {
                    Fragment F2 = fVar2.mo8731F();
                    IRecordingOperationPanel iRecordingOperationPanel3 = this.f133668a;
                    if (!(iRecordingOperationPanel3 == null || (zoomEvent = iRecordingOperationPanel3.getZoomEvent()) == null)) {
                        zoomEvent.observe(F2, new C58734c(this));
                    }
                }
            }
            IRecordingOperationPanel iRecordingOperationPanel4 = this.f133668a;
            if (iRecordingOperationPanel4 == null || iRecordingOperationPanel4.getCameraPos() != 0) {
                z = false;
            } else {
                z = true;
            }
            AbstractC11685f fVar3 = this.f133670c;
            if (fVar3 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 1;
                }
                fVar3.mo8735a(i);
            }
            IRecordingOperationPanel iRecordingOperationPanel5 = this.f133668a;
            if (iRecordingOperationPanel5 != null) {
                iVar = iRecordingOperationPanel5.filterModule();
            } else {
                iVar = null;
            }
            this.f133689w = iVar;
            if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel() && (kVar = this.f133678k) != null) {
                this.f133664A = kVar.mo116942c();
                this.f133691y = kVar.mo116945d();
                this.f133692z = kVar.mo116947e();
                this.f133665B = kVar.mo116922a();
                this.f133666C = kVar.mo116936b();
            }
            AbstractC11685f fVar4 = this.f133670c;
            if (fVar4 != null) {
                fVar4.mo8729D();
            }
            C58754b bVar = this.f133687u;
            if (bVar != null) {
                bVar.f133715a = 1;
                bVar.mo96153a();
            }
            C1731i.m5631a(100).mo5534a(new C58751m(this), C1731i.f5564c, null);
            C1731i.m5631a(100).mo5534a(new C58752n(this), C1731i.f5564c, null);
            SimpleDraweeView simpleDraweeView2 = this.f133686t;
            if (simpleDraweeView2 != null) {
                simpleDraweeView2.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final C89391z mo96137a(float f, float f2) {
        AbstractC74319k kVar;
        AbstractC11685f fVar = this.f133670c;
        if (fVar == null || (kVar = this.f133678k) == null) {
            return null;
        }
        String A = fVar.mo8726A();
        C89219l.m154716b(A, "");
        if (A.length() == 0) {
            kVar.mo116939b(f, f2);
        } else {
            kVar.mo116931a(fVar.mo8726A(), f, f2);
        }
        return C89391z.f203057a;
    }

    public TTLiveBroadcastView(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        AbstractC74319k kVar;
        AbstractC1196i lifecycle;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(223);
        this.f133668a = iRecordingOperationPanel;
        this.f133669b = new FrameLayout(context);
        Live.getService();
        EventBus.m156966a(EventBus.m156962a(), this);
        if (!(iRecordingOperationPanel == null || (lifecycle = iRecordingOperationPanel.getLifecycle()) == null)) {
            lifecycle.mo4012a(this);
        }
        this.f133669b.setVisibility(4);
        this.f133669b.setId(R.id.c_z);
        this.f133687u = new C58754b(this.f133669b);
        this.f133688v = Live.getService().mo12980a(C58736e.f133696a);
        if (iRecordingOperationPanel != null) {
            kVar = iRecordingOperationPanel.videoRecorder();
        } else {
            kVar = null;
        }
        this.f133678k = kVar;
        if (kVar != null) {
            kVar.mo116928a(new C58733b(this), AbstractC74315h.C74316a.f167124a);
            MethodCollector.m26664o(223);
            return;
        }
        MethodCollector.m26664o(223);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$d */
    static final class C58735d implements AbstractC11821a {

        /* renamed from: a */
        public static final C58735d f133695a = new C58735d();

        static {
            Covode.recordClassIndex(69041);
        }

        C58735d() {
        }

        @Override // com.bytedance.android.livesdkapi.p697j.AbstractC11821a
        /* renamed from: a */
        public final void mo18890a(Activity activity, C11666c cVar, AbstractC11665b bVar) {
            Dialog a = LiveHostOuterService.m107232p().mo95796a(activity, cVar, bVar);
            if (a != null) {
                a.show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView$e */
    static final class C58736e implements AbstractC11821a {

        /* renamed from: a */
        public static final C58736e f133696a = new C58736e();

        static {
            Covode.recordClassIndex(69042);
        }

        C58736e() {
        }

        @Override // com.bytedance.android.livesdkapi.p697j.AbstractC11821a
        /* renamed from: a */
        public final void mo18890a(Activity activity, C11666c cVar, AbstractC11665b bVar) {
            Dialog a = LiveHostOuterService.m107232p().mo95796a(activity, cVar, bVar);
            if (a != null) {
                a.show();
            }
        }
    }
}
