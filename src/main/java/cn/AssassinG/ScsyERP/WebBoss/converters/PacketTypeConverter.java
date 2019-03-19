package cn.AssassinG.ScsyERP.WebBoss.converters;

import cn.AssassinG.ScsyERP.BasicInfo.facade.enums.PacketType;
import org.springframework.core.convert.converter.Converter;

public class PacketTypeConverter implements Converter<Integer, PacketType> {
    @Override
    public PacketType convert(Integer value) {
        return PacketType.getEnum(value);
    }
}
