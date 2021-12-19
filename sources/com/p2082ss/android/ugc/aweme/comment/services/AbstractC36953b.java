package com.p2082ss.android.ugc.aweme.comment.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.forward.p3004a.C51414a;

/* renamed from: com.ss.android.ugc.aweme.comment.services.b */
public interface AbstractC36953b {
    static {
        Covode.recordClassIndex(44299);
    }

    /* renamed from: a */
    void mo64424a(int i, int i2, String str, String str2, boolean z);

    /* renamed from: a */
    void mo64425a(String str);

    /* renamed from: a */
    void mo64426a(String str, int i);

    /* renamed from: b */
    void mo64427b(Exception exc, int i, Comment comment);

    /* renamed from: b */
    void mo64428b(String str);

    /* renamed from: e */
    void mo64429e(Comment comment);

    /* renamed from: e */
    void mo64430e(boolean z);

    /* renamed from: f */
    void mo64431f(Comment comment);

    /* renamed from: f */
    void mo64432f(boolean z);

    /* renamed from: g */
    void mo64433g(Comment comment);

    /* renamed from: m */
    Aweme mo64434m();

    /* renamed from: n */
    Comment mo64435n();

    /* renamed from: o */
    String mo64436o();

    void onEvent(C51414a aVar);

    /* renamed from: p */
    int mo64438p();

    /* renamed from: q */
    boolean mo64439q();
}
