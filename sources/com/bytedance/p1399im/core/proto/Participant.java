package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.Participant */
public final class Participant extends Message<Participant, Builder> {
    public static final ProtoAdapter<Participant> ADAPTER = new ProtoAdapter_Participant();
    public static final BlockStatus DEFAULT_BLOCKED = BlockStatus.UNBLOCK;
    public static final Long DEFAULT_LEFT_BLOCK_TIME = 0L;
    public static final Integer DEFAULT_ROLE = 0;
    public static final Long DEFAULT_SORT_ORDER = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "alias")
    public final String alias;
    @AbstractC27891c(mo46611a = "blocked")
    public final BlockStatus blocked;
    @AbstractC27891c(mo46611a = "ext")
    public final Map<String, String> ext;
    @AbstractC27891c(mo46611a = "left_block_time")
    public final Long left_block_time;
    @AbstractC27891c(mo46611a = "role")
    public final Integer role;
    @AbstractC27891c(mo46611a = "sec_uid")
    public final String sec_uid;
    @AbstractC27891c(mo46611a = "sort_order")
    public final Long sort_order;
    @AbstractC27891c(mo46611a = "user_id")
    public final Long user_id;

    /* renamed from: com.bytedance.im.core.proto.Participant$ProtoAdapter_Participant */
    static final class ProtoAdapter_Participant extends ProtoAdapter<Participant> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23384);
        }

        public ProtoAdapter_Participant() {
            super(FieldEncoding.LENGTH_DELIMITED, Participant.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.Participant$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.Participant redact(com.bytedance.p1399im.core.proto.Participant r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.Participant$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.Participant r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.Participant.ProtoAdapter_Participant.redact(com.bytedance.im.core.proto.Participant):com.bytedance.im.core.proto.Participant");
        }

        public final int encodedSize(Participant participant) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, participant.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, participant.sort_order) + ProtoAdapter.INT32.encodedSizeWithTag(3, participant.role) + ProtoAdapter.STRING.encodedSizeWithTag(4, participant.alias) + ProtoAdapter.STRING.encodedSizeWithTag(5, participant.sec_uid) + BlockStatus.ADAPTER.encodedSizeWithTag(6, participant.blocked) + ProtoAdapter.INT64.encodedSizeWithTag(7, participant.left_block_time) + this.ext.encodedSizeWithTag(8, participant.ext) + participant.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Participant decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.sort_order(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.role(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.alias(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            try {
                                builder.blocked(BlockStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.left_block_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Participant participant) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, participant.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, participant.sort_order);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, participant.role);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, participant.alias);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, participant.sec_uid);
            BlockStatus.ADAPTER.encodeWithTag(protoWriter, 6, participant.blocked);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, participant.left_block_time);
            this.ext.encodeWithTag(protoWriter, 8, participant.ext);
            protoWriter.writeBytes(participant.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.Participant$Builder */
    public static final class Builder extends Message.Builder<Participant, Builder> {
        public String alias;
        public BlockStatus blocked;
        public Map<String, String> ext = Internal.newMutableMap();
        public Long left_block_time;
        public Integer role;
        public String sec_uid;
        public Long sort_order;
        public Long user_id;

        static {
            Covode.recordClassIndex(23383);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Participant build() {
            return new Participant(this.user_id, this.sort_order, this.role, this.alias, this.sec_uid, this.blocked, this.left_block_time, this.ext, super.buildUnknownFields());
        }

        public final Builder alias(String str) {
            this.alias = str;
            return this;
        }

        public final Builder blocked(BlockStatus blockStatus) {
            this.blocked = blockStatus;
            return this;
        }

        public final Builder left_block_time(Long l) {
            this.left_block_time = l;
            return this;
        }

        public final Builder role(Integer num) {
            this.role = num;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder sort_order(Long l) {
            this.sort_order = l;
            return this;
        }

        public final Builder user_id(Long l) {
            this.user_id = l;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "Participant" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23382);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.Participant$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Participant, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.sort_order = this.sort_order;
        builder.role = this.role;
        builder.alias = this.alias;
        builder.sec_uid = this.sec_uid;
        builder.blocked = this.blocked;
        builder.left_block_time = this.left_block_time;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2, BlockStatus blockStatus, Long l3, Map<String, String> map) {
        this(l, l2, num, str, str2, blockStatus, l3, map, C89427i.EMPTY);
    }

    public Participant(Long l, Long l2, Integer num, String str, String str2, BlockStatus blockStatus, Long l3, Map<String, String> map, C89427i iVar) {
        super(ADAPTER, iVar);
        this.user_id = l;
        this.sort_order = l2;
        this.role = num;
        this.alias = str;
        this.sec_uid = str2;
        this.blocked = blockStatus;
        this.left_block_time = l3;
        this.ext = Internal.immutableCopyOf("ext", map);
    }
}
