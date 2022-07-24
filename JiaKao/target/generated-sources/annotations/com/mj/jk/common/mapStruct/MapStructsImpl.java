package com.mj.jk.common.mapStruct;

import com.mj.jk.pojo.po.DictItem;
import com.mj.jk.pojo.po.DictType;
import com.mj.jk.pojo.po.ExamPlace;
import com.mj.jk.pojo.po.ExamPlaceCourse;
import com.mj.jk.pojo.po.PlateRegion;
import com.mj.jk.pojo.po.SysResource;
import com.mj.jk.pojo.po.SysRole;
import com.mj.jk.pojo.po.SysUser;
import com.mj.jk.pojo.vo.LoginVo;
import com.mj.jk.pojo.vo.list.DictItemVo;
import com.mj.jk.pojo.vo.list.DictTypeVo;
import com.mj.jk.pojo.vo.list.ExamPlaceCourseVo;
import com.mj.jk.pojo.vo.list.ExamPlaceVo;
import com.mj.jk.pojo.vo.list.PlateRegionVo;
import com.mj.jk.pojo.vo.list.SysResourceVo;
import com.mj.jk.pojo.vo.list.SysRoleVo;
import com.mj.jk.pojo.vo.list.SysUserVo;
import com.mj.jk.pojo.vo.req.save.DictItemReqVo;
import com.mj.jk.pojo.vo.req.save.DictTypeReqVo;
import com.mj.jk.pojo.vo.req.save.ExamPlaceCourseReqVo;
import com.mj.jk.pojo.vo.req.save.ExamPlaceReqVo;
import com.mj.jk.pojo.vo.req.save.PlateRegionReqVo;
import com.mj.jk.pojo.vo.req.save.SysResourceReqVo;
import com.mj.jk.pojo.vo.req.save.SysRoleReqVo;
import com.mj.jk.pojo.vo.req.save.SysUserReqVo;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-07T23:32:14+0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.1 (Oracle Corporation)"
)
public class MapStructsImpl implements MapStructs {

    @Override
    public DictItemVo po2vo(DictItem po) {
        if ( po == null ) {
            return null;
        }

        DictItemVo dictItemVo = new DictItemVo();

        dictItemVo.setId( po.getId() );
        dictItemVo.setName( po.getName() );
        dictItemVo.setValue( po.getValue() );
        dictItemVo.setSn( po.getSn() );
        dictItemVo.setDisabled( po.getDisabled() );
        dictItemVo.setTypeId( po.getTypeId() );

        return dictItemVo;
    }

    @Override
    public DictTypeVo po2vo(DictType po) {
        if ( po == null ) {
            return null;
        }

        DictTypeVo dictTypeVo = new DictTypeVo();

        dictTypeVo.setId( po.getId() );
        dictTypeVo.setName( po.getName() );
        dictTypeVo.setValue( po.getValue() );
        dictTypeVo.setIntro( po.getIntro() );

        return dictTypeVo;
    }

    @Override
    public ExamPlaceVo po2vo(ExamPlace po) {
        if ( po == null ) {
            return null;
        }

        ExamPlaceVo examPlaceVo = new ExamPlaceVo();

        examPlaceVo.setId( po.getId() );
        examPlaceVo.setName( po.getName() );
        examPlaceVo.setProvinceId( po.getProvinceId() );
        examPlaceVo.setCityId( po.getCityId() );
        examPlaceVo.setAddress( po.getAddress() );
        examPlaceVo.setLatitude( po.getLatitude() );
        examPlaceVo.setLongitude( po.getLongitude() );

        return examPlaceVo;
    }

    @Override
    public PlateRegionVo po2vo(PlateRegion po) {
        if ( po == null ) {
            return null;
        }

        PlateRegionVo plateRegionVo = new PlateRegionVo();

        plateRegionVo.setId( po.getId() );
        plateRegionVo.setName( po.getName() );
        plateRegionVo.setPlate( po.getPlate() );
        plateRegionVo.setParentId( po.getParentId() );

        return plateRegionVo;
    }

    @Override
    public ExamPlaceCourseVo po2vo(ExamPlaceCourse po) {
        if ( po == null ) {
            return null;
        }

        ExamPlaceCourseVo examPlaceCourseVo = new ExamPlaceCourseVo();

        examPlaceCourseVo.setId( po.getId() );
        examPlaceCourseVo.setName( po.getName() );
        examPlaceCourseVo.setPrice( po.getPrice() );
        examPlaceCourseVo.setType( po.getType() );
        examPlaceCourseVo.setIntro( po.getIntro() );
        examPlaceCourseVo.setPlaceId( po.getPlaceId() );
        examPlaceCourseVo.setCover( po.getCover() );

        return examPlaceCourseVo;
    }

    @Override
    public SysUserVo po2vo(SysUser po) {
        if ( po == null ) {
            return null;
        }

        SysUserVo sysUserVo = new SysUserVo();

        sysUserVo.setLoginTime( MapStructFormatter.date2millis( po.getLoginTime() ) );
        sysUserVo.setId( po.getId() );
        sysUserVo.setNickname( po.getNickname() );
        sysUserVo.setUsername( po.getUsername() );
        sysUserVo.setStatus( po.getStatus() );

        return sysUserVo;
    }

    @Override
    public LoginVo po2loginVo(SysUser po) {
        if ( po == null ) {
            return null;
        }

        LoginVo loginVo = new LoginVo();

        loginVo.setId( po.getId() );
        loginVo.setNickname( po.getNickname() );
        loginVo.setUsername( po.getUsername() );

        return loginVo;
    }

    @Override
    public SysRoleVo po2vo(SysRole po) {
        if ( po == null ) {
            return null;
        }

        SysRoleVo sysRoleVo = new SysRoleVo();

        sysRoleVo.setId( po.getId() );
        sysRoleVo.setName( po.getName() );

        return sysRoleVo;
    }

    @Override
    public SysResourceVo po2vo(SysResource po) {
        if ( po == null ) {
            return null;
        }

        SysResourceVo sysResourceVo = new SysResourceVo();

        sysResourceVo.setId( po.getId() );
        sysResourceVo.setName( po.getName() );
        sysResourceVo.setUri( po.getUri() );
        sysResourceVo.setPermission( po.getPermission() );
        sysResourceVo.setType( po.getType() );
        sysResourceVo.setIcon( po.getIcon() );
        sysResourceVo.setSn( po.getSn() );
        sysResourceVo.setParentId( po.getParentId() );

        return sysResourceVo;
    }

    @Override
    public DictItem reqVo2po(DictItemReqVo reqVo) {
        if ( reqVo == null ) {
            return null;
        }

        DictItem dictItem = new DictItem();

        dictItem.setId( reqVo.getId() );
        dictItem.setName( reqVo.getName() );
        dictItem.setValue( reqVo.getValue() );
        dictItem.setSn( reqVo.getSn() );
        dictItem.setDisabled( reqVo.getDisabled() );
        dictItem.setTypeId( reqVo.getTypeId() );

        return dictItem;
    }

    @Override
    public DictType reqVo2po(DictTypeReqVo reqVo) {
        if ( reqVo == null ) {
            return null;
        }

        DictType dictType = new DictType();

        dictType.setId( reqVo.getId() );
        dictType.setName( reqVo.getName() );
        dictType.setValue( reqVo.getValue() );
        dictType.setIntro( reqVo.getIntro() );

        return dictType;
    }

    @Override
    public ExamPlace reqVo2po(ExamPlaceReqVo reqVo) {
        if ( reqVo == null ) {
            return null;
        }

        ExamPlace examPlace = new ExamPlace();

        examPlace.setId( reqVo.getId() );
        examPlace.setName( reqVo.getName() );
        examPlace.setProvinceId( reqVo.getProvinceId() );
        examPlace.setCityId( reqVo.getCityId() );
        examPlace.setAddress( reqVo.getAddress() );
        examPlace.setLatitude( reqVo.getLatitude() );
        examPlace.setLongitude( reqVo.getLongitude() );

        return examPlace;
    }

    @Override
    public PlateRegion reqVo2po(PlateRegionReqVo reqVo) {
        if ( reqVo == null ) {
            return null;
        }

        PlateRegion plateRegion = new PlateRegion();

        plateRegion.setId( reqVo.getId() );
        plateRegion.setName( reqVo.getName() );
        plateRegion.setPlate( reqVo.getPlate() );
        plateRegion.setParentId( reqVo.getParentId() );

        return plateRegion;
    }

    @Override
    public ExamPlaceCourse reqVo2po(ExamPlaceCourseReqVo reqVo) {
        if ( reqVo == null ) {
            return null;
        }

        ExamPlaceCourse examPlaceCourse = new ExamPlaceCourse();

        examPlaceCourse.setId( reqVo.getId() );
        examPlaceCourse.setName( reqVo.getName() );
        examPlaceCourse.setPrice( reqVo.getPrice() );
        examPlaceCourse.setType( reqVo.getType() );
        examPlaceCourse.setIntro( reqVo.getIntro() );
        examPlaceCourse.setCover( reqVo.getCover() );
        examPlaceCourse.setPlaceId( reqVo.getPlaceId() );

        return examPlaceCourse;
    }

    @Override
    public SysUser reqVo2po(SysUserReqVo reqVo) {
        if ( reqVo == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setId( reqVo.getId() );
        sysUser.setNickname( reqVo.getNickname() );
        sysUser.setUsername( reqVo.getUsername() );
        sysUser.setPassword( reqVo.getPassword() );
        sysUser.setStatus( reqVo.getStatus() );

        return sysUser;
    }

    @Override
    public SysRole reqVo2po(SysRoleReqVo reqVo) {
        if ( reqVo == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        sysRole.setId( reqVo.getId() );
        sysRole.setName( reqVo.getName() );

        return sysRole;
    }

    @Override
    public SysResource reqVo2po(SysResourceReqVo reqVo) {
        if ( reqVo == null ) {
            return null;
        }

        SysResource sysResource = new SysResource();

        sysResource.setId( reqVo.getId() );
        sysResource.setName( reqVo.getName() );
        sysResource.setUri( reqVo.getUri() );
        sysResource.setPermission( reqVo.getPermission() );
        sysResource.setType( reqVo.getType() );
        sysResource.setIcon( reqVo.getIcon() );
        sysResource.setSn( reqVo.getSn() );
        sysResource.setParentId( reqVo.getParentId() );

        return sysResource;
    }
}
