package com.thp.spring.simplecontext.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.simplecontext.dto.RoleDTO;
import com.thp.spring.simplecontext.entity.Role;
import com.thp.spring.simplecontext.repository.RoleRepository;
import com.thp.spring.simplecontext.service.RoleService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<RoleDTO> findAll() {

		ArrayList<Role> roles = (ArrayList<Role>) roleRepository.findAll();
		ArrayList<RoleDTO> rolesDTO = new ArrayList<>();

		for (int i = 0; i < roles.size(); i++) {
			rolesDTO.add(modelMapper.map(roles.get(i), RoleDTO.class));
		}
		roleRepository.findAll();

		return rolesDTO;
	}

}
