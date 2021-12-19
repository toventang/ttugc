package com.p2082ss.android.ugc.aweme.comment.p2496j;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.google.p1998c.p1999a.C27254p;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.comment.C36535m;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36497f;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.j.n */
public final class C36517n extends C39088c<C36515l, AbstractC36522q> {

    /* renamed from: a */
    public int f86462a;

    /* renamed from: b */
    private List<Object> f86463b;

    /* renamed from: c */
    private Comment f86464c;

    static {
        Covode.recordClassIndex(43820);
    }

    public C36517n() {
        mo67838a(new C36515l());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public final void mo57527b() {
        super.mo57527b();
        if (this.f92287i != null) {
            ((AbstractC36522q) this.f92287i).mo63491b(this.f86464c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        this.f86463b = null;
        if (this.f92287i == null || this.f92286h == null || this.f92286h.mData == null || this.f92286h.mData.comment == null) {
            Comment comment = this.f86464c;
            if (comment != null && comment.getFakeGiftId() != 0 && this.f92287i != null && this.f92286h != null && this.f92286h.mData != null && this.f92286h.mData.comment == null) {
                ((AbstractC36522q) this.f92287i).mo63503d(this.f86464c);
                return;
            }
            return;
        }
        Comment comment2 = this.f92286h.mData.comment;
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_comment", comment2.getAwemeId());
        if (this.f86462a != 1 || C13603b.m24435a((Collection) comment2.getReplyComments())) {
            if (this.f86462a != 2 || C13603b.m24435a((Collection) comment2.getReplyComments())) {
                comment2.setCommentType(this.f86462a);
                if (comment2.getReplyComments() == null) {
                    comment2.setReplyComments(new ArrayList());
                }
            } else {
                Comment comment3 = comment2.getReplyComments().get(0);
                comment2.setReplyToReplyId(comment3.getCid());
                if (!TextUtils.equals(comment2.getReplyId(), comment2.getReplyToReplyCommentId())) {
                    comment2.setReplyToUserName(C80580in.m139676a(comment3.getUser()));
                } else {
                    comment2.setReplyToReplyId("0");
                }
                comment2.setReplyComments(null);
                comment2.setCommentType(2);
            }
            ((AbstractC36522q) this.f92287i).mo63499c(comment2);
            return;
        }
        Comment comment4 = comment2.getReplyComments().get(0);
        comment4.setCommentType(1);
        ArrayList arrayList = new ArrayList();
        comment2.setReplyComments(null);
        comment2.setCommentType(2);
        arrayList.add(comment2);
        comment4.setReplyComments(arrayList);
        ((AbstractC36522q) this.f92287i).mo63499c(comment4);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC36522q) this.f92287i).mo63482a(exc, this.f86464c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        this.f86463b = new ArrayList();
        for (Object obj : objArr) {
            this.f86463b.add(obj);
        }
        return super.mo57616a(objArr);
    }

    /* renamed from: b */
    public final void mo63988b(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        this.f86463b = arrayList;
        arrayList.addAll(Arrays.asList(objArr));
        if (this.f92286h != null && !mo67842j()) {
            this.f92286h.sendRequest(objArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: com.ss.android.ugc.aweme.comment.model.Comment */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: com.ss.android.ugc.aweme.comment.model.Comment */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: com.ss.android.ugc.aweme.comment.model.Comment */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final boolean mo63987a(C36497f fVar) {
        int i;
        C36535m.C36536a aVar;
        Comment comment = new Comment();
        this.f86464c = comment;
        comment.setStoryEmojiComment(fVar.f86368q);
        this.f86464c.setAwemeId(fVar.f86271a);
        User curUser = C31575b.m65865g().getCurUser();
        Aweme b = AwemeService.m70060b().mo60684b(fVar.f86271a);
        if (b != null && TextUtils.equals(b.getAuthorUid(), curUser.getUid())) {
            Context j = C17873f.m33102j();
            if (j == null) {
                j = C17867d.m33078a();
            }
            this.f86464c.setLabelText(j.getString(R.string.wr));
            this.f86464c.setLabelType(1);
        }
        curUser.setUserDisplayName(C80580in.m139677a(curUser, false));
        this.f86464c.setUser(curUser);
        String sb = new StringBuilder().append(System.currentTimeMillis()).append(UUID.randomUUID()).toString();
        this.f86464c.setFakeId(sb);
        this.f86464c.setText(fVar.f86272b);
        this.f86464c.setCommentType(this.f86462a);
        this.f86464c.setReplyComments(new ArrayList());
        this.f86464c.setShouldDisplayFakeComment(true);
        if (!TextUtils.isEmpty(fVar.f86275e)) {
            this.f86464c.setReplyId(fVar.f86273c);
            this.f86464c.setTextExtra(fVar.f86274d);
            this.f86464c.setReplyToReplyId(fVar.f86275e);
            C36535m.m74353b(this.f86464c, 2);
        } else if (!TextUtils.isEmpty(fVar.f86273c)) {
            this.f86464c.setReplyId(fVar.f86273c);
            this.f86464c.setTextExtra(fVar.f86274d);
            this.f86464c.setReplyToReplyId(fVar.f86273c);
            C36535m.m74353b(this.f86464c, 2);
        } else {
            this.f86464c.setReplyId(fVar.f86273c);
            this.f86464c.setTextExtra(fVar.f86274d);
            this.f86464c.setReplyToReplyId(null);
            if (fVar.f86282l != 0 && !C27254p.m54261a(fVar.f86281k)) {
                this.f86464c.setFakeGiftId(fVar.f86282l);
                this.f86464c.setGiftEffectPath(fVar.f86283m);
                if (C27254p.m54261a(fVar.f86272b)) {
                    this.f86464c.setShouldDisplayFakeComment(false);
                }
            }
            C36535m.m74353b(this.f86464c, 1);
        }
        Comment comment2 = this.f86464c;
        if (fVar.f86366o == 0) {
            i = 0;
        } else {
            i = 1;
        }
        comment2.setCommentStructType(i);
        fVar.f86279i = sb;
        C36535m.m74362j(this.f86464c);
        Comment comment3 = this.f86464c;
        C89219l.m154721d(fVar, "");
        if (comment3 != null) {
            Map<String, C36535m.C36536a> map = C36535m.f86493a;
            String fakeId = comment3.getFakeId();
            C89219l.m154716b(fakeId, "");
            C36535m.C36536a aVar2 = C36535m.f86493a.get(comment3.getFakeId());
            if (aVar2 == null || (aVar = C36535m.C36536a.m74364a(aVar2, 0, null, 0, fVar, 0, null, 55)) == null) {
                aVar = new C36535m.C36536a(0, null, 0, fVar, 0, null, 55);
            }
            map.put(fakeId, aVar);
        }
        return super.mo57616a(fVar);
    }
}
