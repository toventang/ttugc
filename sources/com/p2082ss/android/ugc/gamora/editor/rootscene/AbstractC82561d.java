package com.p2082ss.android.ugc.gamora.editor.rootscene;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac;
import com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82564a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.rootscene.d */
public abstract class AbstractC82561d extends AbstractC22186b {

    /* renamed from: v */
    public AbstractC82036ac f184654v;

    static {
        Covode.recordClassIndex(96406);
    }

    /* renamed from: G */
    public abstract AbstractC82564a mo87618G();

    /* renamed from: W */
    public boolean mo87634W() {
        return true;
    }

    /* renamed from: a */
    public void mo87639a(C56724i iVar) {
        C89219l.m154721d(iVar, "");
    }

    /* renamed from: a */
    public void mo87640a(Effect effect, CustomStickerInfo customStickerInfo) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(customStickerInfo, "");
    }

    /* renamed from: a */
    public void mo87644a(boolean z, boolean z2, Runnable runnable) {
        C89219l.m154721d(runnable, "");
    }

    /* renamed from: a */
    public void mo127618a(boolean z, boolean z2, Runnable runnable, Runnable runnable2) {
        C89219l.m154721d(runnable, "");
    }

    /* renamed from: a */
    public void mo87645a(boolean z, boolean z2, boolean z3, Runnable runnable) {
        C89219l.m154721d(runnable, "");
    }

    /* renamed from: a */
    public void mo127619a(boolean z, boolean z2, boolean z3, Runnable runnable, Runnable runnable2) {
        C89219l.m154721d(runnable, "");
    }

    /* renamed from: aa */
    public boolean mo87646aa() {
        return false;
    }

    /* renamed from: ae */
    public void mo127620ae() {
    }

    /* renamed from: af */
    public void mo127621af() {
    }

    /* renamed from: ai */
    public void mo127622ai() {
    }

    /* renamed from: am */
    public void mo127623am() {
    }

    /* renamed from: b */
    public void mo87649b(boolean z, boolean z2, boolean z3, Runnable runnable) {
        C89219l.m154721d(runnable, "");
    }

    /* renamed from: ap */
    public final AbstractC82036ac mo127624ap() {
        AbstractC82036ac acVar = this.f184654v;
        if (acVar == null) {
            C89219l.m154710a("musicController");
        }
        return acVar;
    }

    /* renamed from: a */
    public final void mo127617a(AbstractC82036ac acVar) {
        C89219l.m154721d(acVar, "");
        this.f184654v = acVar;
    }
}
