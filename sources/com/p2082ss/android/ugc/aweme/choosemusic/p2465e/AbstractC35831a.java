package com.p2082ss.android.ugc.aweme.choosemusic.p2465e;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.e.a */
public abstract class AbstractC35831a implements IAccountService.AbstractC31272b, AbstractC35835b {

    /* renamed from: d */
    private static String f84591d = "FAKE_USER";

    /* renamed from: a */
    public int f84592a = -1;

    /* renamed from: b */
    public List<MusicSearchHistory> f84593b;

    /* renamed from: c */
    public List<WeakReference<AbstractC35834a>> f84594c;

    /* renamed from: e */
    private int f84595e = 10;

    /* renamed from: f */
    private C27910f f84596f = new C27910f();

    /* renamed from: g */
    private IAccountService f84597g;

    /* renamed from: h */
    private List<Pair<String, List<MusicSearchHistory>>> f84598h;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.e.a$a */
    public interface AbstractC35834a {
        static {
            Covode.recordClassIndex(43073);
        }

        /* renamed from: a */
        void mo62759a(List<MusicSearchHistory> list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo62939a(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract List<MusicSearchHistory> mo62942c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract String mo62943d();

    static {
        Covode.recordClassIndex(43070);
    }

    /* renamed from: b */
    public final void mo62940b() {
        try {
            mo62939a(this.f84596f.mo46675b(this.f84598h, new C27895a<List<Pair<String, List<MusicSearchHistory>>>>() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.p2465e.AbstractC35831a.C358321 */

                static {
                    Covode.recordClassIndex(43071);
                }
            }.type));
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final List<MusicSearchHistory> mo62944e() {
        ArrayList arrayList = new ArrayList();
        List<MusicSearchHistory> list = this.f84593b;
        if (list != null && list.size() > 0) {
            arrayList.addAll(this.f84593b);
        }
        return arrayList;
    }

    protected AbstractC35831a() {
        IAccountService a = AccountService.m65215a();
        this.f84597g = a;
        a.mo57064a(this);
        this.f84598h = m73217h();
        m73216g();
    }

    /* renamed from: a */
    public final void mo62937a() {
        List<MusicSearchHistory> list = this.f84593b;
        List<WeakReference<AbstractC35834a>> list2 = this.f84594c;
        if (list2 != null) {
            for (WeakReference<AbstractC35834a> weakReference : list2) {
                if (weakReference.get() != null) {
                    weakReference.get().mo62759a(list);
                }
            }
        }
    }

    /* renamed from: g */
    private void m73216g() {
        String str;
        IAccountUserService e = this.f84597g.mo57069e();
        if (e.isLogin()) {
            str = e.getCurUserId();
        } else {
            str = f84591d;
        }
        Iterator<Pair<String, List<MusicSearchHistory>>> it = this.f84598h.iterator();
        this.f84593b = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<MusicSearchHistory>> next = it.next();
            if (TextUtils.equals((CharSequence) next.first, str)) {
                this.f84593b.addAll((Collection) next.second);
                it.remove();
            }
        }
        this.f84598h.add(0, new Pair<>(str, this.f84593b));
        if (this.f84595e > 0 && this.f84598h.size() > this.f84595e) {
            List<Pair<String, List<MusicSearchHistory>>> list = this.f84598h;
            list.remove(list.size() - 1);
        }
        mo62940b();
    }

    /* renamed from: h */
    private List<Pair<String, List<MusicSearchHistory>>> m73217h() {
        try {
            String d = mo62943d();
            if (TextUtils.isEmpty(d)) {
                List<MusicSearchHistory> c = mo62942c();
                if (c == null) {
                    c = new ArrayList<>();
                } else {
                    mo62945f();
                }
                ArrayList arrayList = new ArrayList();
                this.f84598h = arrayList;
                arrayList.add(new Pair(f84591d, c));
            } else {
                this.f84598h = (List) this.f84596f.mo46671a(d, new C27895a<List<Pair<String, List<MusicSearchHistory>>>>() {
                    /* class com.p2082ss.android.ugc.aweme.choosemusic.p2465e.AbstractC35831a.C358332 */

                    static {
                        Covode.recordClassIndex(43072);
                    }
                }.type);
            }
        } catch (Exception unused) {
        }
        if (this.f84598h == null) {
            this.f84598h = new ArrayList();
        }
        return this.f84598h;
    }

    /* renamed from: a */
    public final void mo62938a(MusicSearchHistory musicSearchHistory) {
        this.f84593b.remove(musicSearchHistory);
        mo62940b();
        mo62937a();
    }

    /* renamed from: b */
    public final void mo62941b(MusicSearchHistory musicSearchHistory) {
        this.f84593b.remove(musicSearchHistory);
        this.f84593b.add(0, musicSearchHistory);
        if (this.f84592a > 0 && this.f84593b.size() > this.f84592a) {
            List<MusicSearchHistory> list = this.f84593b;
            list.remove(list.size() - 1);
        }
        mo62940b();
        mo62937a();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2) {
            if (i == 1 || i == 3) {
                Iterator<Pair<String, List<MusicSearchHistory>>> it = this.f84598h.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals((CharSequence) it.next().first, f84591d)) {
                        it.remove();
                    }
                }
                mo62940b();
            } else {
                return;
            }
        }
        this.f84598h.clear();
        this.f84598h = m73217h();
        m73216g();
    }
}
