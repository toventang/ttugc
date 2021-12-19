package com.bytedance.android.live.publicscreen.impl.widget.p402b;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.model.C5984b;
import com.bytedance.android.live.publicscreen.impl.model.C6015e;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5888b;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.C9879j;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.c */
public final class C6064c<MODEL extends AbstractC5877k<? extends AbstractC6571a>> extends AbstractC5888b<MODEL> implements AbstractC5877k.AbstractC5878a {

    /* renamed from: a */
    public final TextView f15191a;

    /* renamed from: d */
    public CharSequence f15192d;

    /* renamed from: e */
    private final HSImageView f15193e;

    /* renamed from: f */
    private Spannable f15194f;

    static {
        Covode.recordClassIndex(6681);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.c$b */
    public static final class C6067b implements AbstractC5877k.AbstractC5879b {

        /* renamed from: a */
        final /* synthetic */ C6064c f15197a;

        static {
            Covode.recordClassIndex(6684);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6067b(C6064c cVar) {
            this.f15197a = cVar;
        }

        @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k.AbstractC5879b
        /* renamed from: a */
        public final void mo11712a(Spannable spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15197a.f15191a.getText());
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) spannable);
            this.f15197a.f15191a.setText(spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f15197a.f15192d);
            spannableStringBuilder2.append((CharSequence) " ");
            this.f15197a.f15192d = spannableStringBuilder2.append((CharSequence) spannable);
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.c$a */
    static final class View$OnLongClickListenerC6066a implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C6064c f15196a;

        static {
            Covode.recordClassIndex(6683);
        }

        View$OnLongClickListenerC6066a(C6064c cVar) {
            this.f15196a = cVar;
        }

        public final boolean onLongClick(View view) {
            C5889g gVar = this.f15196a.f14742b;
            if (gVar == null) {
                return true;
            }
            gVar.mo11743a((AbstractC5877k) this.f15196a.f14743c);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6064c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.text);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f15191a = textView;
        View findViewById2 = view.findViewById(R.id.bid);
        C89219l.m154716b(findViewById2, "");
        HSImageView hSImageView = (HSImageView) findViewById2;
        this.f15193e = hSImageView;
        hSImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.publicscreen.impl.widget.p402b.C6064c.View$OnClickListenerC60651 */

            /* renamed from: a */
            final /* synthetic */ C6064c f15195a;

            static {
                Covode.recordClassIndex(6682);
            }

            {
                this.f15195a = r1;
            }

            public final void onClick(View view) {
                User b;
                AbstractC5877k kVar = (AbstractC5877k) this.f15195a.f14743c;
                if (kVar != null && kVar.f14737d.f28131L == EnumC9596a.MEMBER) {
                    MESSAGE message = kVar.f14737d;
                    Objects.requireNonNull(message, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.MemberMessage");
                    C9627ay ayVar = (C9627ay) message;
                    if (ayVar.f23457s != null) {
                        C9698b bVar = ayVar.f23457s;
                        C89219l.m154716b(bVar, "");
                        if (C89219l.m154714a((Object) "pm_mt_guidance_interaction", (Object) bVar.f23645a)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("event_type", "click");
                            hashMap.put("click_module", "head");
                            C6501b.C6502a.m13948a("livesdk_anchor_interact_notice").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
                        }
                    }
                }
                AbstractC5877k kVar2 = (AbstractC5877k) this.f15195a.f14743c;
                if (kVar2 != null && (b = kVar2.mo10375b()) != null) {
                    UserProfileEvent userProfileEvent = new UserProfileEvent(b.getId(), "head");
                    userProfileEvent.mSource = "live_comment";
                    C6779a.m14563a().mo13053a(userProfileEvent);
                }
            }
        });
        if (C6068d.f15198a == null) {
            C6068d.f15198a = new C6068d();
        }
        textView.setMovementMethod(C6068d.f15198a);
        textView.setOnLongClickListener(new View$OnLongClickListenerC6066a(this));
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k.AbstractC5878a
    /* renamed from: a */
    public final void mo11711a(Bitmap bitmap, AbstractC5877k<? extends AbstractC6571a> kVar) {
        if (bitmap != null && kVar != null) {
            int a = C89361p.m154885a((CharSequence) String.valueOf(this.f15192d), " . ");
            if (a != -1) {
                CharSequence charSequence = this.f15192d;
                if (!(charSequence instanceof Spannable)) {
                    charSequence = null;
                }
                Spannable spannable = (Spannable) charSequence;
                if (spannable != null) {
                    C7557c.m15542a(spannable, bitmap, a + 1, a + 2, kVar);
                }
            }
            Spannable spannable2 = this.f15194f;
            if (spannable2 != null) {
                int a2 = C89361p.m154885a((CharSequence) String.valueOf(spannable2), " . ");
                if (a2 != -1) {
                    C7557c.m15542a(this.f15194f, bitmap, a2 + 1, a2 + 2, kVar);
                }
                this.f15191a.setText(this.f15194f);
                return;
            }
            this.f15191a.setText(this.f15192d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo10370a(C5889g gVar, MODEL model) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(model, "");
        gVar.mo11741a(this.f15191a);
        this.f15191a.setTag(R.id.epm, model.f14737d);
        ImageModel J = model.mo11709J();
        if (J != null) {
            C3941k.m9601a(this.f15193e, J);
        } else {
            this.f15193e.setImageResource(model.mo10712h_());
        }
        this.f15194f = null;
        CharSequence z = model.mo11710z();
        if (z != null) {
            this.f15192d = z;
            this.f15191a.setText(z);
            if (model instanceof C6015e) {
                ((C6015e) model).mo11903a(this);
            }
            if (model instanceof C5984b) {
                C5984b bVar = (C5984b) model;
                if (((C9879j) bVar.f14737d).f23862h != null && !C13603b.m24435a((Collection) ((C9879j) bVar.f14737d).f23862h.getUrls()) && !TextUtils.isEmpty(((C9879j) bVar.f14737d).f23862h.getUrls().get(0))) {
                    TextView textView = this.f15191a;
                    ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a(((C9879j) bVar.f14737d).f23862h, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: INVOKE  
                          (wrap: com.bytedance.android.livesdkapi.host.e : 0x009f: CHECK_CAST (r1v6 com.bytedance.android.livesdkapi.host.e) = (com.bytedance.android.livesdkapi.host.e) (wrap: com.bytedance.android.live.base.a : 0x009b: INVOKE  (r1v5 com.bytedance.android.live.base.a) = (wrap: java.lang.Class : 0x0099: CONST_CLASS   com.bytedance.android.livesdkapi.host.e.class) type: STATIC call: com.bytedance.android.live.t.a.a(java.lang.Class):com.bytedance.android.live.base.a))
                          (wrap: com.bytedance.android.live.base.model.ImageModel : 0x00a5: IGET  (r0v30 com.bytedance.android.live.base.model.ImageModel) = 
                          (wrap: com.bytedance.android.livesdk.model.message.j : 0x00a3: CHECK_CAST (r0v29 com.bytedance.android.livesdk.model.message.j) = (com.bytedance.android.livesdk.model.message.j) (wrap: MESSAGE extends com.bytedance.android.livesdk.ab.b.a : 0x00a1: IGET  (r0v28 MESSAGE extends com.bytedance.android.livesdk.ab.b.a) = (r3v1 'bVar' com.bytedance.android.live.publicscreen.impl.model.b) com.bytedance.android.live.publicscreen.a.d.k.d com.bytedance.android.livesdk.ab.b.a))
                         com.bytedance.android.livesdk.model.message.j.h com.bytedance.android.live.base.model.ImageModel)
                          (wrap: com.bytedance.android.live.publicscreen.impl.model.b$1 : 0x00a9: CONSTRUCTOR  (r2v1 com.bytedance.android.live.publicscreen.impl.model.b$1) = 
                          (r3v1 'bVar' com.bytedance.android.live.publicscreen.impl.model.b)
                          (wrap: java.lang.ref.WeakReference : 0x0089: CONSTRUCTOR  (r4v0 java.lang.ref.WeakReference) = (r0v23 'textView' android.widget.TextView) call: java.lang.ref.WeakReference.<init>(java.lang.Object):void type: CONSTRUCTOR)
                          (wrap: float : 0x0098: ARITH  (r5v1 float) = (wrap: float : 0x0094: IGET  (r5v0 float) = 
                          (wrap: android.util.DisplayMetrics : 0x0090: INVOKE  (r0v25 android.util.DisplayMetrics) = 
                          (wrap: android.content.res.Resources : 0x008c: INVOKE  (r0v24 android.content.res.Resources) = (r0v23 'textView' android.widget.TextView) type: VIRTUAL call: android.widget.TextView.getResources():android.content.res.Resources)
                         type: VIRTUAL call: android.content.res.Resources.getDisplayMetrics():android.util.DisplayMetrics)
                         android.util.DisplayMetrics.density float) / (3.0f float))
                          (wrap: com.bytedance.android.livesdkapi.depend.model.live.Room : 0x0080: IGET  (r6v0 com.bytedance.android.livesdkapi.depend.model.live.Room) = (r9v0 'gVar' com.bytedance.android.live.publicscreen.a.g) com.bytedance.android.live.publicscreen.a.g.j com.bytedance.android.livesdkapi.depend.model.live.Room)
                          (wrap: com.bytedance.android.live.publicscreen.impl.widget.b.c$b : 0x0084: CONSTRUCTOR  (r7v0 com.bytedance.android.live.publicscreen.impl.widget.b.c$b) = 
                          (r8v0 'this' com.bytedance.android.live.publicscreen.impl.widget.b.c<MODEL extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ab.b.a>> A[IMMUTABLE_TYPE, THIS])
                         call: com.bytedance.android.live.publicscreen.impl.widget.b.c.b.<init>(com.bytedance.android.live.publicscreen.impl.widget.b.c):void type: CONSTRUCTOR)
                         call: com.bytedance.android.live.publicscreen.impl.model.b.1.<init>(com.bytedance.android.live.publicscreen.impl.model.b, java.lang.ref.WeakReference, float, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.live.publicscreen.a.d.k$b):void type: CONSTRUCTOR)
                         type: INTERFACE call: com.bytedance.android.livesdkapi.host.e.a(com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.livesdkapi.host.e$b):com.bytedance.android.livesdkapi.host.e$a in method: com.bytedance.android.live.publicscreen.impl.widget.b.c.a(com.bytedance.android.live.publicscreen.a.g, MODEL extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ab.b.a>):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a9: CONSTRUCTOR  (r2v1 com.bytedance.android.live.publicscreen.impl.model.b$1) = 
                          (r3v1 'bVar' com.bytedance.android.live.publicscreen.impl.model.b)
                          (wrap: java.lang.ref.WeakReference : 0x0089: CONSTRUCTOR  (r4v0 java.lang.ref.WeakReference) = (r0v23 'textView' android.widget.TextView) call: java.lang.ref.WeakReference.<init>(java.lang.Object):void type: CONSTRUCTOR)
                          (wrap: float : 0x0098: ARITH  (r5v1 float) = (wrap: float : 0x0094: IGET  (r5v0 float) = 
                          (wrap: android.util.DisplayMetrics : 0x0090: INVOKE  (r0v25 android.util.DisplayMetrics) = 
                          (wrap: android.content.res.Resources : 0x008c: INVOKE  (r0v24 android.content.res.Resources) = (r0v23 'textView' android.widget.TextView) type: VIRTUAL call: android.widget.TextView.getResources():android.content.res.Resources)
                         type: VIRTUAL call: android.content.res.Resources.getDisplayMetrics():android.util.DisplayMetrics)
                         android.util.DisplayMetrics.density float) / (3.0f float))
                          (wrap: com.bytedance.android.livesdkapi.depend.model.live.Room : 0x0080: IGET  (r6v0 com.bytedance.android.livesdkapi.depend.model.live.Room) = (r9v0 'gVar' com.bytedance.android.live.publicscreen.a.g) com.bytedance.android.live.publicscreen.a.g.j com.bytedance.android.livesdkapi.depend.model.live.Room)
                          (wrap: com.bytedance.android.live.publicscreen.impl.widget.b.c$b : 0x0084: CONSTRUCTOR  (r7v0 com.bytedance.android.live.publicscreen.impl.widget.b.c$b) = 
                          (r8v0 'this' com.bytedance.android.live.publicscreen.impl.widget.b.c<MODEL extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ab.b.a>> A[IMMUTABLE_TYPE, THIS])
                         call: com.bytedance.android.live.publicscreen.impl.widget.b.c.b.<init>(com.bytedance.android.live.publicscreen.impl.widget.b.c):void type: CONSTRUCTOR)
                         call: com.bytedance.android.live.publicscreen.impl.model.b.1.<init>(com.bytedance.android.live.publicscreen.impl.model.b, java.lang.ref.WeakReference, float, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.live.publicscreen.a.d.k$b):void type: CONSTRUCTOR in method: com.bytedance.android.live.publicscreen.impl.widget.b.c.a(com.bytedance.android.live.publicscreen.a.g, MODEL extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ab.b.a>):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.live.publicscreen.impl.model.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 41 more
                        */
                    /*
                    // Method dump skipped, instructions count: 176
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.p402b.C6064c.mo10370a(com.bytedance.android.live.publicscreen.a.g, com.bytedance.android.live.publicscreen.a.d.k):void");
                }
            }
