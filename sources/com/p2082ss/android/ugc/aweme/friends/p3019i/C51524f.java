package com.p2082ss.android.ugc.aweme.friends.p3019i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51452c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.i.f */
public final class C51524f {

    /* renamed from: a */
    public int f118735a;

    /* renamed from: b */
    public List<String> f118736b = new ArrayList();

    /* renamed from: c */
    public List<Integer> f118737c = new ArrayList();

    static {
        Covode.recordClassIndex(60789);
    }

    /* renamed from: a */
    public final C51452c mo87024a() {
        int[] iArr = new int[this.f118737c.size()];
        int size = this.f118737c.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f118737c.get(i).intValue();
        }
        String[] strArr = new String[this.f118736b.size()];
        Objects.requireNonNull(this.f118736b.toArray(new String[0]), "null cannot be cast to non-null type kotlin.Array<T>");
        return new C51452c(strArr, iArr);
    }

    /* renamed from: a */
    public final void mo87025a(List<Friend> list) {
        int i;
        boolean z;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<Friend> it = list.iterator();
        while (it.hasNext()) {
            Friend next = it.next();
            if (!TextUtils.equals(next.getSection(), "#") && !TextUtils.equals(next.getSection(), "…") && next.getSection() != null) {
                String section = next.getSection();
                C89219l.m154716b(section, "");
                int length = section.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (C89219l.m154703a(section.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2) {
                        if (!z) {
                            break;
                        }
                        length--;
                    } else if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                }
                if (!TextUtils.isEmpty(section.subSequence(i2, length + 1).toString())) {
                }
            }
            it.remove();
            next.setSection("#");
            arrayList.add(next);
        }
        Collections.sort(list, C51525a.f118738a);
        list.addAll(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Friend friend : list) {
            if (friend != null) {
                String section2 = friend.getSection();
                if (!linkedHashMap.containsKey(section2)) {
                    C89219l.m154716b(section2, "");
                    linkedHashMap.put(section2, 1);
                } else {
                    C89219l.m154716b(section2, "");
                    Integer num = (Integer) linkedHashMap.get(section2);
                    if (num == null) {
                        num = 0;
                    }
                    linkedHashMap.put(section2, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            arrayList2.add(obj);
            int i3 = linkedHashMap.get(obj);
            if (i3 == null) {
                i3 = 0;
            }
            arrayList3.add(i3);
        }
        this.f118736b = arrayList2;
        this.f118737c = arrayList3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.i.f$a */
    public static final class C51525a<T> implements Comparator {

        /* renamed from: a */
        public static final C51525a f118738a = new C51525a();

        static {
            Covode.recordClassIndex(60790);
        }

        C51525a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Friend friend = (Friend) obj;
            Friend friend2 = (Friend) obj2;
            C89219l.m154716b(friend, "");
            String section = friend.getSection();
            C89219l.m154716b(section, "");
            Objects.requireNonNull(section, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = section.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            char charAt = lowerCase.charAt(0);
            C89219l.m154716b(friend2, "");
            String section2 = friend2.getSection();
            C89219l.m154716b(section2, "");
            Objects.requireNonNull(section2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = section2.toLowerCase();
            C89219l.m154716b(lowerCase2, "");
            return charAt - lowerCase2.charAt(0);
        }
    }
}
