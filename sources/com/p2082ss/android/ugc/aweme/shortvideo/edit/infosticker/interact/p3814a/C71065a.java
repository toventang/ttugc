package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3814a;

import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45887e;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81786b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71165f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.p2082ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a */
public class C71065a extends AbstractC71078c implements AbstractC81786b {

    /* renamed from: A */
    private VideoPublishEditModel f159149A;

    /* renamed from: B */
    private EditCommentStickerViewModel f159150B;

    /* renamed from: C */
    private boolean f159151C;

    /* renamed from: a */
    public CommentVideoModel f159152a;

    /* renamed from: b */
    public String f159153b;

    /* renamed from: c */
    public boolean f159154c;

    static {
        Covode.recordClassIndex(83564);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: e */
    public final int mo112286e() {
        return 4;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: f */
    public final int mo112287f() {
        return R.string.axi;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final boolean mo112283b() {
        if (this.f159152a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m125527r() {
        VideoPublishEditModel videoPublishEditModel = this.f159149A;
        if (videoPublishEditModel == null) {
            return false;
        }
        return videoPublishEditModel.mIsFromDraft;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: d */
    public final void mo112285d() {
        super.mo112285d();
        this.f159152a = null;
        this.f159150B.mo127201a(false);
    }

    /* renamed from: q */
    private static String m125526q() {
        return "pi_start" + UUID.randomUUID().toString() + "pi_end";
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: g */
    public final boolean mo112288g() {
        return ((EditCommentStickerState) this.f159150B.mo33676a((ActivityC0580d) this.f159190t)).getInTimeEditView();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: c */
    public final InteractStickerStruct mo112284c() {
        if (!mo112283b() || this.f159182l == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        if (this.f159152a.isQuestion()) {
            interactStickerStruct.setType(7);
            interactStickerStruct.setIndex(5);
        } else {
            interactStickerStruct.setType(4);
            interactStickerStruct.setIndex(2);
        }
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(m125575b(this.f159182l.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.f159182l.getScale()));
        PointF a = mo112303a(this.f159182l.getCenterViewPoint());
        normalTrackTimeStamp.setX(a.x);
        normalTrackTimeStamp.setY(a.y);
        normalTrackTimeStamp.setStartTime((float) this.f159152a.getStartTime());
        normalTrackTimeStamp.setEndTime((float) this.f159152a.getEndTime());
        PointF a2 = mo112303a(new PointF((float) this.f159182l.getContentViewWidth(), (float) this.f159182l.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a2.x);
        normalTrackTimeStamp.setHeight(a2.y);
        linkedList.add(normalTrackTimeStamp);
        C45887e.m88531a(interactStickerStruct, linkedList);
        HashMap hashMap = new HashMap();
        hashMap.put("comment_sticker_id", "0");
        interactStickerStruct.setAttr(C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(hashMap));
        return interactStickerStruct;
    }

    public C71065a(VideoPublishEditModel videoPublishEditModel) {
        this.f159149A = videoPublishEditModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final C45922g mo112275a(Context context) {
        CommentVideoModel commentVideoModel = this.f159152a;
        if (commentVideoModel == null || !commentVideoModel.isQuestion()) {
            C71069d dVar = new C71069d(context);
            dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            dVar.setController(this);
            dVar.setDumpData(this);
            dVar.setLockMode(true);
            return dVar;
        }
        C71165f fVar = new C71165f(context);
        fVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        fVar.setController(this);
        fVar.setDumpData(this);
        fVar.setLockMode(true);
        return fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112279a(String str) {
        if (C13627m.m24498a(str)) {
            return;
        }
        if (str.contains("pi_start") && str.contains("pi_end")) {
            super.mo112279a(str.replaceAll("pi_start(.*?)pi_end", m125526q()));
        } else if (str.endsWith(File.separator)) {
            super.mo112279a(str + m125526q());
        } else {
            super.mo112279a(str + m125526q());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112280a(boolean z) {
        super.mo112280a(z);
        if (!(this.f159182l instanceof C71069d)) {
            return;
        }
        if (!m125527r() || this.f159151C) {
            ((C71069d) this.f159182l).mo112300v();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final boolean mo112282a(C45922g gVar) {
        if (!(gVar instanceof C71069d)) {
            return false;
        }
        boolean a = super.mo112282a(gVar);
        this.f159152a = null;
        this.f159150B.mo127201a(false);
        if (this.f159149A.commentVideoModel.isCommentFromEditPanel()) {
            this.f159149A.commentVideoModel = null;
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112276a(Context context, FrameLayout frameLayout) {
        super.mo112276a(context, frameLayout);
        this.f159150B = (EditCommentStickerViewModel) C20531t.m38716a((ActivityC0945e) this.f159190t).mo33800a(EditCommentStickerViewModel.class);
        this.f159154c = false;
    }

    /* renamed from: a */
    public final void mo112278a(InteractStickerStruct interactStickerStruct, CommentVideoModel commentVideoModel) {
        this.f159152a = commentVideoModel;
        this.f159150B.mo127201a(true);
        if (!(interactStickerStruct == null || commentVideoModel == null)) {
            mo112277a(commentVideoModel, true, false);
            this.f159153b = (String) ((HashMap) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46671a(interactStickerStruct.getAttr(), new C27895a<HashMap<String, String>>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3814a.C71065a.C710661 */

                static {
                    Covode.recordClassIndex(83565);
                }
            }.type)).get("comment_sticker_id");
        }
        ((C71069d) this.f159182l).mo112290a(commentVideoModel, new C71067b(this, interactStickerStruct));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112281a(boolean z, boolean z2) {
        super.mo112280a(z);
        if (!(this.f159182l instanceof C71069d)) {
            return;
        }
        if (z2 || !m125527r() || this.f159151C) {
            ((C71069d) this.f159182l).mo112300v();
        }
    }

    /* renamed from: a */
    public final void mo112277a(CommentVideoModel commentVideoModel, boolean z, boolean z2) {
        this.f159150B.mo127201a(true);
        this.f159152a = commentVideoModel;
        this.f159151C = z2;
        mo112281a(z, true);
        if (this.f159184n != null) {
            this.f159184n.mo112344f();
        }
    }
}
