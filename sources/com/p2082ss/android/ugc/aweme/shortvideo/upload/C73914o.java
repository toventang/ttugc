package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C71818ev;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.o */
public final class C73914o extends ArrayList<AbstractC74304x<C69831ai>> implements AbstractC74304x<C69831ai> {
    static {
        Covode.recordClassIndex(86660);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishCancel() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((AbstractC74304x) it.next()).onParallelPublishCancel();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishPause() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((AbstractC74304x) it.next()).onParallelPublishPause();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishResume() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((AbstractC74304x) it.next()).onParallelPublishResume();
        }
    }

    public final /* bridge */ boolean contains(AbstractC74304x xVar) {
        return super.contains((Object) xVar);
    }

    public final /* bridge */ int indexOf(AbstractC74304x xVar) {
        return super.indexOf((Object) xVar);
    }

    public final /* bridge */ int lastIndexOf(AbstractC74304x xVar) {
        return super.lastIndexOf((Object) xVar);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public final AbstractC74304x<C69831ai> remove(int i) {
        return removeAt(i);
    }

    public final AbstractC74304x removeAt(int i) {
        return (AbstractC74304x) super.remove(i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof AbstractC74304x)) {
            return false;
        }
        return contains((AbstractC74304x) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof AbstractC74304x)) {
            return -1;
        }
        return indexOf((AbstractC74304x) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC74304x)) {
            return -1;
        }
        return lastIndexOf((AbstractC74304x) obj);
    }

    public final /* bridge */ boolean remove(AbstractC74304x xVar) {
        return super.remove((Object) xVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onError(C71818ev evVar) {
        C89219l.m154721d(evVar, "");
        Iterator it = iterator();
        while (it.hasNext()) {
            ((AbstractC74304x) it.next()).onError(evVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onSynthetiseSuccess(String str) {
        C89219l.m154721d(str, "");
        Iterator it = iterator();
        while (it.hasNext()) {
            ((AbstractC74304x) it.next()).onSynthetiseSuccess(str);
        }
    }

    @Override // java.util.List, java.util.ArrayList
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof AbstractC74304x)) {
            return false;
        }
        return remove((AbstractC74304x) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onProgressUpdate(int i, boolean z) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((AbstractC74304x) it.next()).onProgressUpdate(i, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onSuccess(C69831ai aiVar, boolean z) {
        C89219l.m154721d(aiVar, "");
        Iterator it = iterator();
        while (it.hasNext()) {
            ((AbstractC74304x) it.next()).onSuccess(aiVar, z);
        }
    }
}
