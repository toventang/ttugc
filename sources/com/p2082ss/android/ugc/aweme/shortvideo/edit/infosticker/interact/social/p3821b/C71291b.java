package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71289a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71292c;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.b */
public class C71291b<T extends AbstractC71289a<?>, K extends AbstractC71292c> implements AbstractC71293d {

    /* renamed from: b */
    public T f159790b;

    /* renamed from: c */
    public K f159791c;

    static {
        Covode.recordClassIndex(83810);
    }

    /* renamed from: a */
    public void mo112784a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71293d
    /* renamed from: a */
    public void mo112785a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71293d
    /* renamed from: b */
    public void mo112787b() {
    }

    /* renamed from: c */
    public final boolean mo112788c() {
        if (this.f159791c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m125971d() {
        T t = this.f159790b;
        if (t != null) {
            return t.f159787d;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo112786a(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (this.f159790b != null && !m125971d()) {
            T t = this.f159790b;
            if (t == null) {
                C89219l.m154715b();
            }
            if (t.mo112783b(Arrays.copyOf(objArr, 2))) {
                mo112784a();
                return true;
            }
        }
        return false;
    }
}
