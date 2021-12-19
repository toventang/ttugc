package com.p2082ss.android.ugc.aweme.ttlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89726j;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89739w;
import p4640l.p4644b.AbstractC89740x;

/* renamed from: com.ss.android.ugc.aweme.ttlive.ILiveApi */
public interface ILiveApi {
    static {
        Covode.recordClassIndex(92528);
    }

    @AbstractC89739w
    @AbstractC89722f
    AbstractC21983b<TypedInput> downloadFile(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC89740x String str, @AbstractC89726j Map<String, String> map, @AbstractC21996d Object obj);

    @AbstractC89722f
    AbstractC21983b<TypedInput> get(@AbstractC89740x String str, @AbstractC89726j Map<String, String> map, @AbstractC21996d Object obj);

    @AbstractC89722f(mo144276a = "/tiktok/v1/edibility/birthdate/")
    AbstractC88979t<C79335a> getDoBStatus();

    @AbstractC89731o
    AbstractC21983b<TypedInput> post(@AbstractC89740x String str, @AbstractC21994b TypedByteArray typedByteArray, @AbstractC89726j Map<String, String> map, @AbstractC21996d Object obj);

    @AbstractC89731o
    AbstractC21983b<TypedInput> postMultiPart(@AbstractC22007o int i, @AbstractC89740x String str, @AbstractC89726j Map<String, String> map, @AbstractC21994b TypedOutput typedOutput);
}
