package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3814a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20531t;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81787c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3859a.C72837b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.C72864a;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.p2082ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.d */
public class C71069d extends C45922g {

    /* renamed from: q */
    protected CommentStickerView f159159q;

    /* renamed from: r */
    private int f159160r;

    /* renamed from: s */
    private int f159161s;

    /* renamed from: t */
    private int f159162t;

    /* renamed from: u */
    private EditCommentStickerViewModel f159163u;

    static {
        Covode.recordClassIndex(83568);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: o */
    public final boolean mo77372o() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: p */
    public final boolean mo77376p() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    public View getDrawView() {
        return this.f159159q;
    }

    /* renamed from: s */
    public final void mo112293s() {
        this.f159159q.setVisibility(0);
    }

    /* renamed from: u */
    public final C72864a mo112299u() {
        return this.f159159q.mo65021c();
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final AbstractC45824b mo77336a() {
        return new C72837b(this, new C45922g.C45923a());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: d */
    public final boolean mo77350d() {
        if (this.f159159q.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: i */
    public final boolean mo77366i() {
        return ((EditCommentStickerState) this.f159163u.mo33676a((ActivityC0580d) this.f106949a)).getInTimeEditView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo112292r() {
        MethodCollector.m26663i(13872);
        LayoutInflater.from(this.f106949a).inflate(R.layout.ahp, this);
        MethodCollector.m26664o(13872);
    }

    /* renamed from: t */
    public final void mo112298t() {
        if (this.f159159q.mo65023e()) {
            post(new RunnableC71071f(this));
        }
    }

    /* renamed from: v */
    public final void mo112300v() {
        int c;
        if (this.f106955g != null) {
            if (C78099c.m136517a(this.f106949a)) {
                this.f106955g.setX(C13628n.m24520b(getContext(), -32.0f));
            } else {
                this.f106955g.setX(C13628n.m24520b(getContext(), 32.0f));
            }
            if (C33398a.f79357a.mo59454e()) {
                c = 0;
            } else {
                c = C70636dh.m124833c(this.f106949a);
            }
            this.f106955g.setY(C13628n.m24520b(getContext(), 130.0f) + ((float) c));
        }
    }

    public C71069d(Context context) {
        this(context, (byte) 0);
    }

    public void setAlpha(float f) {
        this.f159159q.setAlpha(f);
    }

    public void setController(C71065a aVar) {
        this.f159159q.setController(aVar);
    }

    public void setDumpData(AbstractC72865b bVar) {
        CommentStickerView commentStickerView = this.f159159q;
        if (commentStickerView != null) {
            commentStickerView.setDumpData(bVar);
        }
    }

    public void setPlayPosition(long j) {
        this.f159159q.setPlayPosition(j);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: b */
    public final boolean mo77347b(MotionEvent motionEvent) {
        boolean b = super.mo77347b(motionEvent);
        this.f159159q.setTouching(false);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo112291a(AbstractC81787c cVar) {
        this.f106955g.post(new RunnableC71072g(this, cVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g
    /* renamed from: a */
    public final boolean mo77341a(MotionEvent motionEvent) {
        boolean a = super.mo77341a(motionEvent);
        if (a) {
            this.f159159q.setTouching(true);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo112290a(CommentVideoModel commentVideoModel, AbstractC81787c cVar) {
        setVisibility(4);
        this.f159159q.mo65016a(commentVideoModel, new C71070e(this, cVar));
    }

    public C71069d(Context context, byte b) {
        super(context, null);
        this.f106949a = context;
        this.f159161s = (int) C13628n.m24520b(context, 32.0f);
        int a = C13628n.m24504a(context) - this.f159161s;
        this.f159160r = a;
        this.f159162t = a;
        this.f159163u = (EditCommentStickerViewModel) C20531t.m38716a((ActivityC0945e) this.f106949a).mo33800a(EditCommentStickerViewModel.class);
        mo112292r();
        this.f106954f = (StickerHelpBoxView) findViewById(R.id.e8x);
        this.f106955g = findViewById(R.id.ade);
        this.f159159q = (CommentStickerView) findViewById(R.id.ads);
        setVisibility(8);
    }
}
