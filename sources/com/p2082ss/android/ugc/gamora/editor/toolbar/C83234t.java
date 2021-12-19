package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1196b.C17154a;
import com.bytedance.ies.dmt.p1194ui.p1196b.C17156b;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40890e;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40894i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65393cf;
import com.p2082ss.android.ugc.aweme.property.p3609a.C65330a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71393k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71397m;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70939d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.C71528a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.gamora.editor.C82248g;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89378p;
import p4600h.C89390y;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t */
public final class C83234t {

    /* renamed from: a */
    AbstractC23317a f185952a;

    /* renamed from: b */
    public C17156b f185953b;

    /* renamed from: c */
    public final ActivityC0945e f185954c;

    /* renamed from: d */
    public final VideoPublishEditModel f185955d;

    /* renamed from: e */
    public final EditToolbarViewModel f185956e;

    /* renamed from: f */
    private final C88411a f185957f = new C88411a();

    /* renamed from: g */
    private final List<C89378p<LiveData<Object>, AbstractC1214u<Object>>> f185958g = new ArrayList();

    /* renamed from: h */
    private final AbstractC22186b f185959h;

    /* renamed from: i */
    private final AbstractC82427a f185960i;

    static {
        Covode.recordClassIndex(97118);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo128317b() {
        AbstractC23317a aVar = this.f185952a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$a */
    public static final class C83235a implements AbstractC40894i {

        /* renamed from: a */
        final /* synthetic */ C83234t f185961a;

        /* renamed from: b */
        final /* synthetic */ View f185962b;

        static {
            Covode.recordClassIndex(97119);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$a$a */
        static final class RunnableC83236a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C83235a f185963a;

            static {
                Covode.recordClassIndex(97120);
            }

            RunnableC83236a(C83235a aVar) {
                this.f185963a = aVar;
            }

            public final void run() {
                C83234t tVar = this.f185963a.f185961a;
                View view = this.f185963a.f185962b;
                if (tVar.f185956e.f185702a.f184002a && !C63253l.f143623a.mo73306b().mo101549h()) {
                    tVar.mo128318b(view);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40894i
        /* renamed from: a */
        public final void mo70091a() {
            boolean z;
            int i;
            Integer b;
            AbstractC40890e a = C63253l.f143623a.mo73306b().mo101552k().mo101555a();
            C82248g gVar = this.f185961a.f185956e.f185702a;
            int i2 = 0;
            if (a.mo70078a() || ((b = a.mo70079b()) != null && b.intValue() == 3)) {
                z = false;
            } else {
                z = true;
            }
            gVar.f184003b = z;
            this.f185961a.f185954c.runOnUiThread(new RunnableC83236a(this));
            if (this.f185961a.f185956e.f185702a.f184003b && a.mo70080c() >= 0) {
                VideoPublishEditModel videoPublishEditModel = this.f185961a.f185955d;
                C89219l.m154721d(videoPublishEditModel, "");
                C89219l.m154721d(a, "");
                StringBuilder sb = new StringBuilder();
                if (!a.mo70078a()) {
                    List<C69905c> e = a.mo70082e();
                    if (e == null) {
                        C89219l.m154715b();
                    }
                    boolean z2 = false;
                    for (T t : e) {
                        if (z2) {
                            sb.append(",");
                        }
                        sb.append(t.getMid());
                        z2 = true;
                    }
                }
                C84425b a2 = C70968bl.m125280l(videoPublishEditModel).mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_edit_page");
                List<C69905c> e2 = a.mo70082e();
                if (e2 != null) {
                    i2 = e2.size();
                }
                C84425b a3 = a2.mo129403a("music_upload_num", i2).mo129404a("music_upload_duration", a.mo70080c()).mo129406a("music_id_list", sb.toString());
                Integer b2 = a.mo70079b();
                if (b2 != null) {
                    i = b2.intValue();
                } else {
                    i = 2;
                }
                C39162r.m79460a("music_upload_done", a3.mo129403a("music_rec_type", i).f188764a);
                a.mo70081d();
            }
        }

        C83235a(C83234t tVar, View view) {
            this.f185961a = tVar;
            this.f185962b = view;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final View mo128320c() {
        C71397m mVar;
        C83184g gVar = (C83184g) this.f185959h.mo36386a("EditTitleBarScene");
        if (gVar == null || (mVar = gVar.f185886h) == null) {
            return null;
        }
        return mVar.f159985b;
    }

    /* renamed from: a */
    public final void mo128312a() {
        this.f185957f.mo142944a();
        for (T t : this.f185958g) {
            ((LiveData) t.getFirst()).removeObserver((AbstractC1214u) t.getSecond());
        }
        this.f185958g.clear();
        mo128317b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$i */
    public static final class RunnableC83244i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83234t f185975a;

        /* renamed from: b */
        final /* synthetic */ View f185976b;

        /* renamed from: c */
        final /* synthetic */ boolean f185977c;

        static {
            Covode.recordClassIndex(97128);
        }

        RunnableC83244i(C83234t tVar, View view, boolean z) {
            this.f185975a = tVar;
            this.f185976b = view;
            this.f185977c = z;
        }

        public final void run() {
            if (this.f185976b.getVisibility() == 0) {
                C17156b bVar = this.f185975a.f185953b;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                bVar.mo27102a();
                View contentView = bVar.getContentView();
                C89219l.m154716b(contentView, "");
                int measuredWidth = contentView.getMeasuredWidth();
                C17154a aVar = bVar.f40853g;
                if (aVar == null) {
                    C89219l.m154710a("mDmtBubbleLayout");
                }
                float padding = ((float) ((measuredWidth - (aVar.getPADDING() * 4)) - this.f185976b.getMeasuredWidth())) + C13628n.m24520b(this.f185975a.f185954c, 8.0f);
                float b = C13628n.m24520b(this.f185975a.f185954c, 3.0f) + padding;
                if (C82306a.m142357a()) {
                    C17156b bVar2 = this.f185975a.f185953b;
                    if (bVar2 == null) {
                        C89219l.m154715b();
                    }
                    bVar2.mo27105a(this.f185976b, 80, true);
                } else if (this.f185977c) {
                    C17156b bVar3 = this.f185975a.f185953b;
                    if (bVar3 == null) {
                        C89219l.m154715b();
                    }
                    bVar3.mo27103a(this.f185976b, b, -((int) padding));
                } else {
                    int b2 = (int) C13628n.m24520b(this.f185975a.f185954c, 12.0f);
                    C17156b bVar4 = this.f185975a.f185953b;
                    if (bVar4 == null) {
                        C89219l.m154715b();
                    }
                    bVar4.mo27103a(this.f185976b, ((float) b2) + C13628n.m24520b(this.f185975a.f185954c, 3.0f), -b2);
                }
                C39162r.m79460a("function_toast_show", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a(StringSet.type, "music").f188764a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$j */
    public static final class View$OnClickListenerC83245j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83234t f185978a;

        static {
            Covode.recordClassIndex(97129);
        }

        View$OnClickListenerC83245j(C83234t tVar) {
            this.f185978a = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f185978a.f185956e.mo128237a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$e */
    static final class C83240e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View f185968a;

        static {
            Covode.recordClassIndex(97124);
        }

        C83240e(View view) {
            this.f185968a = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                this.f185968a.setEnabled(booleanValue);
                if (booleanValue) {
                    view = this.f185968a;
                    f = 1.0f;
                } else {
                    view = this.f185968a;
                    f = 0.5f;
                }
                view.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$g */
    static final class C83242g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View f185973a;

        static {
            Covode.recordClassIndex(97126);
        }

        C83242g(View view) {
            this.f185973a = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    view = this.f185973a;
                    f = 1.0f;
                } else {
                    view = this.f185973a;
                    f = 0.5f;
                }
                view.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$h */
    static final class C83243h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View f185974a;

        static {
            Covode.recordClassIndex(97127);
        }

        C83243h(View view) {
            this.f185974a = view;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                View view = this.f185974a;
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo128321c(Map<Integer, ? extends View> map) {
        C89219l.m154721d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> c = this.f185956e.mo128250c(intValue);
            if (c != null) {
                m143636a(c, this.f185954c, new C83242g(view));
            }
        }
    }

    /* renamed from: a */
    public final void mo128313a(View view) {
        if (!C63253l.f143623a.mo73306b().mo101549h()) {
            C63253l.f143623a.mo73306b().mo101552k().mo101559a(new C83235a(this, view));
        }
    }

    /* renamed from: b */
    public final void mo128319b(Map<Integer, ? extends View> map) {
        C89219l.m154721d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            C1213t<Boolean> tVar = this.f185956e.mo128258h().get(Integer.valueOf(intValue));
            if (tVar != null) {
                m143636a(tVar, this.f185954c, new C83240e(view));
            }
        }
    }

    /* renamed from: a */
    public final void mo128315a(Map<Integer, ? extends View> map) {
        C89219l.m154721d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> d = this.f185956e.mo128253d(intValue);
            if (d != null) {
                m143636a(d, this.f185954c, new C83243h(view));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo128318b(View view) {
        EnumC23352h hVar;
        String str;
        C69905c cVar;
        C69905c cVar2;
        MethodCollector.m26663i(11196);
        if (view == null) {
            MethodCollector.m26664o(11196);
            return;
        }
        if (this.f185956e.f185702a.f184003b) {
            String str2 = null;
            View inflate = View.inflate(this.f185954c, R.layout.apy, null);
            C89219l.m154716b(inflate, "");
            View findViewById = inflate.findViewById(R.id.f7l);
            C89219l.m154716b(findViewById, "");
            TextView textView = (TextView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.c1h);
            C89219l.m154716b(findViewById2, "");
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById2;
            List<C69905c> e = C63253l.f143623a.mo73306b().mo101552k().mo101555a().mo70082e();
            if (!C13603b.m24435a((Collection) e)) {
                if (e == null || (cVar2 = e.get(0)) == null) {
                    str = null;
                } else {
                    str = cVar2.getName();
                }
                textView.setText(str);
                if (!(e == null || (cVar = e.get(0)) == null)) {
                    str2 = cVar.getPicMedium();
                }
                simpleDraweeView.setImageURI(str2);
            }
            C17156b.C17157a aVar = new C17156b.C17157a(this.f185954c);
            aVar.f40890m = false;
            C89219l.m154721d(inflate, "");
            aVar.f40891n = inflate;
            aVar.f40903z = 8.0f;
            aVar.f40889l = 5000;
            aVar.f40871A = true;
            this.f185953b = aVar.mo27114a();
            new ToolSafeHandler(this.f185954c).post(new RunnableC83244i(this, view, C78099c.m136517a(this.f185954c)));
            C17156b bVar = this.f185953b;
            if (bVar == null) {
                C89219l.m154715b();
            }
            bVar.getContentView().setOnClickListener(new View$OnClickListenerC83245j(this));
        } else {
            AbstractC23332b b = new C23329a(this.f185954c).mo38023e(R.string.bjj).mo38030a(5000L).mo38036a(true).mo38041b(view);
            if (C82306a.m142357a()) {
                hVar = EnumC23352h.BOTTOM;
            } else {
                hVar = EnumC23352h.TOP;
            }
            b.mo38034a(hVar).mo38012d().mo38001a();
        }
        C63253l.f143623a.mo73306b().mo101550i();
        this.f185956e.f185702a.f184002a = false;
        VideoPublishEditModel videoPublishEditModel = this.f185955d;
        C89219l.m154721d(videoPublishEditModel, "");
        C39162r.m79460a("change_music_toast_show", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("creation_id", videoPublishEditModel.creationId).f188764a);
        MethodCollector.m26664o(11196);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$f */
    static final class C83241f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83234t f185969a;

        /* renamed from: b */
        final /* synthetic */ int f185970b;

        /* renamed from: c */
        final /* synthetic */ View f185971c;

        /* renamed from: d */
        final /* synthetic */ int f185972d;

        static {
            Covode.recordClassIndex(97125);
        }

        C83241f(C83234t tVar, int i, View view, int i2) {
            this.f185969a = tVar;
            this.f185970b = i;
            this.f185971c = view;
            this.f185972d = i2;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C17156b bVar;
            int i;
            EnumC23352h hVar;
            EnumC23352h hVar2;
            int i2;
            EnumC23352h hVar3;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C83234t tVar = this.f185969a;
                int i3 = this.f185970b;
                View view = this.f185971c;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 6) {
                                    if (i3 == 15 && booleanValue) {
                                        AbstractC23332b a = ((C23329a) new C23329a(tVar.f185954c).mo38034a(EnumC23352h.START)).mo38023e(R.string.pq).mo38036a(true).mo38030a(5000L);
                                        if (view.getHeight() == 0) {
                                            View c = tVar.mo128320c();
                                            if (c != null) {
                                                a.mo38041b(c);
                                            } else {
                                                return;
                                            }
                                        } else {
                                            View findViewById = view.findViewById(R.id.z7);
                                            if (findViewById != null) {
                                                a.mo38041b(findViewById);
                                            } else {
                                                a.mo38041b(view);
                                            }
                                        }
                                        a.mo38012d().mo38001a();
                                        C71529w.m126422b("cut_optimized");
                                    }
                                } else if (booleanValue) {
                                    AbstractC23332b a2 = ((C23329a) new C23329a(tVar.f185954c).mo38034a(EnumC23352h.START)).mo38023e(R.string.bjm).mo38036a(true).mo38030a(5000L);
                                    if (view.getHeight() == 0) {
                                        View c2 = tVar.mo128320c();
                                        if (c2 != null) {
                                            a2.mo38041b(c2);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        View findViewById2 = view.findViewById(R.id.z7);
                                        if (findViewById2 != null) {
                                            a2.mo38041b(findViewById2);
                                        } else {
                                            a2.mo38041b(view);
                                        }
                                    }
                                    a2.mo38012d().mo38001a();
                                    C71529w.m126422b("voice");
                                    C39162r.m79460a("function_toast_show", new C84425b().mo129406a("creation_id", tVar.f185955d.creationId).mo129406a("content_type", C70968bl.m125249a(tVar.f185955d)).mo129406a("content_source", C70968bl.m125262b(tVar.f185955d)).mo129406a("enter_from", "video_edit_page").mo129406a(StringSet.type, "voice").f188764a);
                                }
                            } else if (booleanValue) {
                                boolean b = C71529w.m126423b();
                                boolean c3 = C71529w.m126424c();
                                if (c3) {
                                    i2 = R.string.bxn;
                                } else if (b) {
                                    i2 = R.string.axk;
                                } else {
                                    i2 = R.string.bjl;
                                }
                                AbstractC23332b b2 = new C23329a(tVar.f185954c).mo38023e(i2).mo38030a(5000L).mo38036a(true).mo38041b(view);
                                if (C82306a.m142357a() || C65393cf.m117092c()) {
                                    hVar3 = EnumC23352h.START;
                                } else {
                                    hVar3 = EnumC23352h.TOP;
                                }
                                b2.mo38034a(hVar3).mo38012d().mo38001a();
                                String str = "custom_sticker";
                                if (C71529w.m126423b()) {
                                    C71529w.m126422b(str);
                                } else if (C71529w.m126424c()) {
                                    C71529w.m126422b("countdown_sticker");
                                } else {
                                    C71529w.m126422b("sticker");
                                }
                                if (c3) {
                                    str = "live_countdown";
                                } else if (!b) {
                                    str = "info_sticker";
                                }
                                C39162r.m79460a("function_toast_show", new C84425b().mo129406a("creation_id", tVar.f185955d.creationId).mo129406a("content_type", C70968bl.m125249a(tVar.f185955d)).mo129406a("content_source", C70968bl.m125262b(tVar.f185955d)).mo129406a("enter_from", "video_edit_page").mo129406a(StringSet.type, str).f188764a);
                            }
                        } else if (booleanValue) {
                            AbstractC23332b b3 = new C23329a(tVar.f185954c).mo38041b(view);
                            if (C82306a.m142357a()) {
                                hVar2 = EnumC23352h.START;
                            } else {
                                hVar2 = EnumC23352h.TOP;
                            }
                            ((C23329a) b3.mo38034a(hVar2)).mo38023e(R.string.axw).mo38036a(true).mo38030a(5000L).mo38012d().mo38001a();
                            C71529w.m126422b("text");
                            try {
                                C39162r.m79460a("function_toast_show", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a(StringSet.type, "text").mo129406a("creation_id", tVar.f185955d.creationId).mo129406a("content_type", C70968bl.m125249a(tVar.f185955d)).mo129406a("content_source", C70968bl.m125262b(tVar.f185955d)).f188764a);
                            } catch (C89390y e) {
                                C73991bj.m130131b("Publish Edit Model late init exception:" + e.getMessage());
                            }
                        }
                    } else if (booleanValue) {
                        if (C82306a.m142357a()) {
                            hVar = EnumC23352h.START;
                        } else {
                            hVar = EnumC23352h.TOP;
                        }
                        if (tVar.f185952a == null) {
                            tVar.f185952a = new C23329a(tVar.f185954c).mo38023e(R.string.bji).mo38030a(5000L).mo38041b(view).mo38034a(hVar).mo38012d();
                        }
                        AbstractC23317a aVar = tVar.f185952a;
                        if (aVar != null) {
                            aVar.mo38001a();
                        }
                        C71529w.m126422b("effect");
                        C39162r.m79460a("function_toast_show", new C84425b().mo129406a("creation_id", tVar.f185955d.creationId).mo129406a("content_type", C70968bl.m125249a(tVar.f185955d)).mo129406a("content_source", C70968bl.m125262b(tVar.f185955d)).mo129406a("enter_from", "video_edit_page").mo129406a(StringSet.type, "effect").f188764a);
                    } else {
                        tVar.mo128317b();
                    }
                } else if (!AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee() && !C65393cf.m117091b()) {
                    if (booleanValue) {
                        if (!C71528a.m126417b(tVar.f185955d) || !C70976bp.m125300a()) {
                            C23329a aVar2 = (C23329a) new C23329a(tVar.f185954c).mo38041b(view).mo38034a(EnumC23352h.TOP);
                            if (C65330a.m117012a()) {
                                i = R.string.bkv;
                            } else {
                                i = R.string.bjj;
                            }
                            aVar2.mo38023e(i).mo38036a(true).mo38030a(5000L).mo38012d().mo38001a();
                            C71529w.m126422b("music");
                            C39162r.m79460a("function_toast_show", new C84425b().mo129406a("creation_id", tVar.f185955d.creationId).mo129406a("content_type", C70968bl.m125249a(tVar.f185955d)).mo129406a("content_source", C70968bl.m125262b(tVar.f185955d)).mo129406a("enter_from", "video_edit_page").mo129406a(StringSet.type, "music").f188764a);
                            return;
                        }
                        tVar.mo128318b(view);
                    } else if (C70976bp.m125316l(tVar.f185955d) && (bVar = tVar.f185953b) != null && bVar.isShowing()) {
                        bVar.dismiss();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$c */
    static final class C83238c extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71393k f185966a;

        static {
            Covode.recordClassIndex(97122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83238c(C71393k kVar) {
            super(2);
            this.f185966a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            this.f185966a.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$d */
    static final class C83239d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Drawable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71393k f185967a;

        static {
            Covode.recordClassIndex(97123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83239d(C71393k kVar) {
            super(2);
            this.f185967a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Drawable drawable) {
            Drawable drawable2 = drawable;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(drawable2, "");
            this.f185967a.setIcon(drawable2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.t$b */
    static final class C83237b extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C83131a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83234t f185964a;

        /* renamed from: b */
        final /* synthetic */ C71393k f185965b;

        static {
            Covode.recordClassIndex(97121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83237b(C83234t tVar, C71393k kVar) {
            super(2);
            this.f185964a = tVar;
            this.f185965b = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C83131a aVar) {
            C83131a aVar2 = aVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(aVar2, "");
            this.f185965b.setIcon(aVar2.f185758a);
            if (aVar2.f185760c) {
                C70939d.m125236a().storeBoolean("key_show_toast", false);
                if (aVar2.f185759b) {
                    new C23144b(this.f185964a.f185954c).mo37640e(R.string.biz).mo37637b();
                } else {
                    new C23144b(this.f185964a.f185954c).mo37640e(R.string.biy).mo37637b();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo128314a(AbstractC20382b bVar, C71393k kVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(kVar, "");
        bVar.selectNonNullSubscribe(this.f185956e, C83247v.f185980a, new C20370ah(), new C83238c(kVar));
        bVar.selectNonNullSubscribe(this.f185956e, C83248w.f185981a, new C20370ah(), new C83239d(kVar));
    }

    /* renamed from: a */
    public final void mo128316a(Map<Integer, ? extends View> map, int i) {
        C89219l.m154721d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            C1213t<Boolean> tVar = this.f185956e.mo128259i().get(Integer.valueOf(intValue));
            if (tVar != null) {
                m143636a(tVar, this.f185954c, new C83241f(this, intValue, view, i));
            }
        }
    }

    /* renamed from: a */
    private final <T> void m143636a(LiveData<T> liveData, AbstractC1204m mVar, AbstractC1214u<T> uVar) {
        liveData.observe(mVar, uVar);
        List<C89378p<LiveData<Object>, AbstractC1214u<Object>>> list = this.f185958g;
        Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        list.add(new C89378p<>(liveData, uVar));
    }

    public C83234t(ActivityC0945e eVar, VideoPublishEditModel videoPublishEditModel, EditToolbarViewModel editToolbarViewModel, AbstractC22186b bVar, AbstractC82427a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(editToolbarViewModel, "");
        C89219l.m154721d(bVar, "");
        this.f185954c = eVar;
        this.f185955d = videoPublishEditModel;
        this.f185956e = editToolbarViewModel;
        this.f185959h = bVar;
        this.f185960i = aVar;
    }
}
