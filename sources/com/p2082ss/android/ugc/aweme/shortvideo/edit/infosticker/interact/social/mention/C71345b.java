package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45887e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71276a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71284d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.C71286e;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b */
public final class C71345b extends AbstractC71276a<User> {

    /* renamed from: C */
    public static final C71346a f159905C = new C71346a((byte) 0);

    static {
        Covode.recordClassIndex(83868);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b$a */
    public static final class C71346a {
        static {
            Covode.recordClassIndex(83869);
        }

        private C71346a() {
        }

        public /* synthetic */ C71346a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b$d */
    public static final class C71349d extends C27895a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83872);
        }

        C71349d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b$b */
    static final class RunnableC71347b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71345b f159906a;

        static {
            Covode.recordClassIndex(83870);
        }

        RunnableC71347b(C71345b bVar) {
            this.f159906a = bVar;
        }

        public final void run() {
            C45922g gVar = this.f159906a.f159182l;
            if (gVar != null) {
                gVar.mo77345b();
            }
        }
    }

    /* renamed from: u */
    private static String m126045u() {
        return "mtn_start" + UUID.randomUUID().toString() + "mtn_end";
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: p */
    public final String mo112326p() {
        String p = super.mo112326p();
        C89219l.m154716b(p, "");
        int a = C89361p.m154888a((CharSequence) p, "/effect/mention_stickers", 0, false, 6);
        if (a <= 0) {
            return p;
        }
        String substring = p.substring(0, a);
        C89219l.m154716b(substring, "");
        return substring;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b$c */
    static final class RunnableC71348c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45922g f159907a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f159908b;

        /* renamed from: c */
        final /* synthetic */ C71345b f159909c;

        static {
            Covode.recordClassIndex(83871);
        }

        RunnableC71348c(C45922g gVar, InteractStickerStruct interactStickerStruct, C71345b bVar) {
            this.f159907a = gVar;
            this.f159908b = interactStickerStruct;
            this.f159909c = bVar;
        }

        public final void run() {
            C45922g gVar = this.f159907a;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            AbstractC71284d mBaseView = ((C71286e) gVar).getMBaseView();
            if (mBaseView != null) {
                mBaseView.mo112753a((AbstractC71284d) false);
            }
            this.f159909c.mo112707a(this.f159907a, this.f159908b);
            ((C71365d) this.f159907a).setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71276a
    /* renamed from: q */
    public final List<String> mo112446q() {
        String str;
        MentionStruct mentionStruct;
        ArrayList arrayList = new ArrayList(this.f159183m.size());
        for (C45922g gVar : this.f159183m) {
            if (!(gVar instanceof C71365d)) {
                gVar = null;
            }
            C71365d dVar = (C71365d) gVar;
            if (dVar == null || (mentionStruct = dVar.getMentionStruct()) == null || (str = mentionStruct.getUsername()) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71345b(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        C89219l.m154721d(videoPublishEditModel, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final C45922g mo112275a(Context context) {
        C71365d dVar = new C71365d(context);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112305a(float f) {
        for (C45922g gVar : this.f159183m) {
            C89219l.m154716b(gVar, "");
            gVar.setAlpha(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71276a
    /* renamed from: a */
    public final List<InteractStickerStruct> mo112706a(List<? extends StickerItemModel> list) {
        C45922g gVar;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f159183m.size());
        for (C45922g gVar2 : this.f159183m) {
            InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(8);
            LinkedList linkedList = new LinkedList();
            NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            C89219l.m154716b(gVar2, "");
            normalTrackTimeStamp.setRotation(AbstractC71078c.m125575b(gVar2.getRotateAngle()));
            normalTrackTimeStamp.setScale(Float.valueOf(gVar2.getScale()));
            PointF a = mo112303a(gVar2.getCenterViewPoint());
            normalTrackTimeStamp.setX(a.x);
            normalTrackTimeStamp.setY(a.y);
            normalTrackTimeStamp.setStartTime(0.0f);
            normalTrackTimeStamp.setEndTime(0.0f);
            PointF a2 = mo112303a(new PointF((float) gVar2.getContentViewWidth(), (float) gVar2.getContentViewHeight()));
            normalTrackTimeStamp.setWidth(a2.x);
            normalTrackTimeStamp.setHeight(a2.y);
            linkedList.add(normalTrackTimeStamp);
            C45887e.m88531a(interactStickerStruct, linkedList);
            if (!(gVar2 instanceof C71365d)) {
                gVar = null;
            } else {
                gVar = gVar2;
            }
            C71365d dVar = (C71365d) gVar;
            if (dVar != null) {
                interactStickerStruct.setMentionInfo(dVar.getMentionStruct());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("mention_sticker_id", ((AbstractC71276a) this).f159747a);
            interactStickerStruct.setAttr(C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(hashMap));
            for (StickerItemModel stickerItemModel : list) {
                if (stickerItemModel.viewHash == gVar2.hashCode()) {
                    interactStickerStruct.setIndex(stickerItemModel.layerWeight);
                }
            }
            arrayList.add(interactStickerStruct);
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112279a(String str) {
        if (str != null && str.length() != 0) {
            if (!C89361p.m154908a((CharSequence) str, (CharSequence) "mtn_start", false) || !C89361p.m154908a((CharSequence) str, (CharSequence) "mtn_end", false)) {
                String str2 = File.separator;
                C89219l.m154716b(str2, "");
                if (C89361p.m154876c(str, str2, false)) {
                    super.mo112279a(str + m126045u());
                } else {
                    super.mo112279a(str + m126045u());
                }
            } else {
                super.mo112279a(new C89350l("mtn_start(.*?)mtn_end").replace(str, m126045u()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b, com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112311a(InteractStickerStruct interactStickerStruct, Boolean bool) {
        if (interactStickerStruct != null) {
            ((AbstractC71276a) this).f159747a = (String) ((HashMap) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46671a(interactStickerStruct.getAttr(), new C71349d().type)).get("mention_sticker_id");
            MentionStruct mentionInfo = interactStickerStruct.getMentionInfo();
            mo112280a(true);
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            ((C71365d) gVar).mo112846a(((AbstractC71276a) this).f159748b, mentionInfo);
            C45922g gVar2 = this.f159182l;
            C89219l.m154716b(gVar2, "");
            gVar2.setVisibility(4);
            C45922g gVar3 = this.f159182l;
            C89219l.m154716b(gVar3, "");
            gVar3.postDelayed(new RunnableC71348c(gVar3, interactStickerStruct, this), 300);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71288f
    /* renamed from: a */
    public final void mo112780a(AbstractC71284d<User> dVar, boolean z) {
        boolean z2;
        String str;
        C89219l.m154721d(dVar, "");
        String content = dVar.getContent();
        if (content == null || content.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            AbstractC71087a aVar = this.f159184n;
            if (aVar != null) {
                aVar.mo112344f();
            }
            mo112285d();
            this.f159182l = ((AbstractC71276a) this).f159745A;
            ((AbstractC71276a) this).f159745A = null;
            return;
        }
        User curModel = dVar.getCurModel();
        C84425b bVar = new C84425b();
        if (curModel == null || (str = curModel.getUid()) == null) {
            str = "";
        }
        C39162r.m79460a("add_at_prop", bVar.mo129406a("to_user_id", str).mo129403a("auto_at", 0).mo129406a("creation_id", this.f159746B.creationId).f188764a);
        if (this.f159182l == null) {
            mo112280a(false);
            C45922g gVar = this.f159182l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            ((C71286e) gVar).mo112771a(frameLayout, dVar);
        } else {
            AbstractC71087a aVar2 = this.f159184n;
            if (aVar2 != null) {
                aVar2.mo112344f();
            }
        }
        if (this.f159182l instanceof C71365d) {
            C45922g gVar2 = this.f159182l;
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerView");
            ((C71286e) gVar2).mo112772a((AbstractC71284d) dVar, false);
            dVar.post(new RunnableC71347b(this));
        }
        ((AbstractC71276a) this).f159745A = null;
    }
}
