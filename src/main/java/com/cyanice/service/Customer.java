package com.cyanice.service;

import org.springframework.data.annotation.Id;

// look mom, no Lombok!
record Customer(@Id Integer id, String name) {
}